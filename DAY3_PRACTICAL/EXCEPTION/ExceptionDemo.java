package EXCEPTION;
class Ts
{
	int x=25;
	int y=0;
	public void m1()
	{
		try
		{
			int z;
			z=x/y;
			System.out.println(z);
		}
	    catch(NullPointerException ne)
		{
	    	ne.printStackTrace();
		}
	}
	public void m2()
	{
		System.out.println("X:"+x);
	}
}
public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Ts t=new Ts();
  t.m1();
  t.m2();
	}

}
