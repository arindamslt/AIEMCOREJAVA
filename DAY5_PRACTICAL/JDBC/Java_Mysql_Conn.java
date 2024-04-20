package JDBC;
import java.sql.*;
import java.util.Scanner;
class Food
{
	Scanner sc;
	Connection cn=null;
	Statement st=null;
	PreparedStatement ps=null;
	ResultSet rs=null;
	String fid=null;
	String fname=null;
	double price=0.0;
	String select_sql="select * from food";
	String insert_sql="insert into food values(?,?,?)";
	String delete_sql="delete from food where foodid=?";
	String update_sql="update food set foodnm=?,price=? where foodid=?";
	public void getData()
	{
		try
		{
		  //Class.forName("com.mysql.cj.jdbc.Driver");//register and load the driver
		  //cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapps","root","arindam");
         ConnectionFactory con=new ConnectionFactory();
         cn=con.getConn();
         st=cn.createStatement();//statement created
		  rs=st.executeQuery(select_sql);
		  while(rs.next())
		  {
			  System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3));
			  //System.out.println(rs.getString(2));
			 // System.out.println(rs.getString(3));
		  }
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void addData()
	{
		sc=new Scanner(System.in);
		System.out.println("ENTER THE FOOD ID");
		fid=sc.next();
		System.out.println("ENTER THE FOOD NAME");
		fname=sc.next();
		System.out.println("ENTER THE FOOD PRICE");
		price=sc.nextDouble();
		try
		{
			ConnectionFactory con=new ConnectionFactory();
	         cn=con.getConn();
		  //Class.forName("com.mysql.cj.jdbc.Driver");//register and load the driver
		  //cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapps","root","arindam");
		  ps=cn.prepareStatement(insert_sql);
		  ps.setString(1, fid);
		  ps.setString(2, fname);
		  ps.setDouble(3, price);
		  ps.executeUpdate();
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		
	}
	public void updateData()
	{
		sc=new Scanner(System.in);
		System.out.println("ENTER THE FOOD ID");
		fid=sc.next();
		System.out.println("ENTER THE FOOD NAME");
		fname=sc.next();
		System.out.println("ENTER THE FOOD PRICE");
		price=sc.nextDouble();
		try
		{
			ConnectionFactory con=new ConnectionFactory();
	         cn=con.getConn();
		  //Class.forName("com.mysql.cj.jdbc.Driver");//register and load the driver
		 //cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapps","root","arindam");
		  ps=cn.prepareStatement(update_sql);
		  ps.setString(3, fid);
		  ps.setString(1, fname);
		  ps.setDouble(2, price);
		  ps.executeUpdate();
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		
	}
	public void deleteData()
	{
		sc=new Scanner(System.in);
		System.out.println("ENTER THE FOOD ID");
		fid=sc.next();
		
		
		try
		{
			ConnectionFactory con=new ConnectionFactory();
	         cn=con.getConn();
		  //Class.forName("com.mysql.cj.jdbc.Driver");//register and load the driver
		  //cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/foodapps","root","arindam");
		  ps=cn.prepareStatement(delete_sql);
		  ps.setString(1, fid);
		  
		  ps.executeUpdate();
		}
		/*catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}*/
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
public class Java_Mysql_Conn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Food fd=new Food();
  //fd.addData();
 // fd.deleteData();
  fd.getData();
  //fd.updateData();
  //fd.getData();
	}

}
