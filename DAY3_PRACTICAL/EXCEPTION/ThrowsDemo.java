package EXCEPTION;
class Calc
{
	String s=null;
	public void display() throws NullPointerException,Exception
	{
		
		System.out.println(s.length());
		
		
	}
	public void m2()
	{
		System.out.println("WELCOME");
	}
}
public class ThrowsDemo {

	public static void main(String[] args) throws NullPointerException, Exception   {
		// TODO Auto-generated method stub
  Calc c=new Calc();
  c.display();
  c.m2();
	}

}
