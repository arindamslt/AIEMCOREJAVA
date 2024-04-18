package EXCEPTION;
import java.sql.*;
class JdbcConnection
{
	Connection cn=null;
	public Connection getConn()
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		cn=DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:XE","scott","tiger");
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return cn;
	}
	
}
public class CheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
