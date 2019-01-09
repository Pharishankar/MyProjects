package com.hari.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hari.beans.Employee;
import com.hari.dao.EmployeeDao;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeDao dao;//will inject dao from xml file.
	
		@RequestMapping("/empForm")
		public String showForm(Model m)
		{
			System.out.println("Inside Controller showForm() method..");
			m.addAttribute("command", new Employee());
			return "empForm";
		}
		
		@RequestMapping(value="save", method=RequestMethod.POST)
		public String save(@ModelAttribute("emp")Employee emp)
		{
			System.out.println("inside controller save() method..");
			dao.save(emp);
			return "redirect:/viewEmp";//will redirect to viewemp request mapping	
		}
		
		/* It provides list of employees in model object */ 
		@RequestMapping("/viewEmp")
		public  String viewEmp(Model m)
		{
			List<Employee> list=dao.getEmployee();
			m.addAttribute("list", list);
			//System.out.println("Data"+list);
			return "viewEmp";
		}
		/* It displays object data into form for the given id.   
	     * The @PathVariable puts URL data into variable.*/ 
		@RequestMapping(value="/editemp/{id}")
		public String edit(@PathVariable int id,Model model)
		{
			System.out.println("Controller edit()...");
			Employee employee=dao.getEmplyeeById(id);
			model.addAttribute("command",employee);
			return "empeditform";
		}
		
		/*it updates model object*/
		@RequestMapping(value="/editsave",method=RequestMethod.POST)
		public String editsave(@ModelAttribute("employee")Employee employee)
		{
			System.out.println("Controller editsave()...");
			dao.update(employee);
			return "redirect:/viewEmp";
		}
		
		/* It deletes record for the given id in URL and redirects to /viewemp */
		@RequestMapping(value="/deleteemp/{id}", method=RequestMethod.GET)
		public String delete(@PathVariable int id)
		{
			System.out.println("Controller delete()...");
			dao.delete(id);
			return "redirect:/viewEmp";
		}
}		

