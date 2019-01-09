package com.hari.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.postgresql.core.Query;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.hari.beans.Employee;

public class EmployeeDao {

	JdbcTemplate template;

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public int save(Employee emp) {
		String sql = "INSERT INTO Employee99(name,salary,designation)values('" + emp.getName() + "'," + emp.getSalary()
				+ ",'" + emp.getDesignation() + "')";
		/*
		 * String
		 * sql1="insert into Emp99(name,salary,designation) values('"+emp.
		 * getName()+"',"+emp.getSalary()+",'"+emp.getDesignation()+"')";
		 */
		return template.update(sql);
	}

	public int update(Employee emp) {
		String sql = "update Employee99 set name='" + emp.getName() + "',salary=" + emp.getSalary() + ",designation='"
				+ emp.getDesignation() + "' where id=" + emp.getId() + "";
		return template.update(sql);
	}

	public Employee getEmplyeeById(int id) {
		String sql = "Select * from Employee99 where id=?";
		return template.queryForObject(sql, new Object[] { id }, new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	public int delete(int id) {
		String sql="DELETE FROM Employee99 where id="+id+"";
		return template.update(sql);
	}

	public List<Employee> getEmployee() {

		return template.query("SELECT * FROM Employee99", new RowMapper<Employee>() {
			public Employee mapRow(ResultSet rs, int row) throws SQLException {
				Employee e = new Employee();
				e.setId(rs.getInt(1));
				e.setName(rs.getString(2));
				e.setSalary(rs.getFloat(3));
				e.setDesignation(rs.getString(4));
				return e;
			}
		});
	}
}
