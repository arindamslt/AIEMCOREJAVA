package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
Connection cn=null;
public Connection getConn()
{
	try
	{
	  Class.forName("com.mysql.cj.jdbc.Driver");//register and load the driver
	  cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapps","root","arindam");
	  
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
