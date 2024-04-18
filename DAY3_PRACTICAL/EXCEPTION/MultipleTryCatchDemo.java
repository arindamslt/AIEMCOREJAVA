package EXCEPTION;
class Tst
{
	int x=10;
	int y=0;
	String s="SUMAN";
	public void test()
	{
		try
		{
		int z;
		z=x/y;
		System.out.println("RESULT:"+z);
		
		}
		catch(ArithmeticException ae)
		{
			ae.printStackTrace();
		}
		try
		{
			System.out.println(s.length());
		}
		catch(NullPointerException ne)
		{
			ne.printStackTrace();
		}
	}
	public void show()
	{
		System.out.println(s);
	}
}
public class MultipleTryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Tst t=new Tst();
  t.test();
  t.show();
	}

}
