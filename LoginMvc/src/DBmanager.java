import java.sql.Connection;
import java.sql.DriverManager;

public class DBmanager {
	static Connection cn;
	public static Connection getConnection()
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","hari");
			
		}catch(Exception xe)
		{
			xe.printStackTrace();
		}
		return cn;
	}
}
