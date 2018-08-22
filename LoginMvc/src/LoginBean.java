import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginBean {
	String name;
	String pass;
	static Boolean b;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setPass(String pass)
	{
		this.pass=pass;
	}
	public String getPass()
	{
		return pass;
	}
	
	public static void validate(String n,String p)throws SQLException
	{
		Connection cn=null;
		PreparedStatement ps=null;
		try{
			cn=DBmanager.getConnection();
			ps=cn.prepareStatement("select * from login where name=(?) and password=(?)");
			ps.setString(1, n);
			ps.setString(2, p);
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()){
				b=true;
			}else{
				b=false;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
