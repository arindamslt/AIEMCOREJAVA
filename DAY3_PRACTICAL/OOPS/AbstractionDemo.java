package OOPS;
abstract class Tst
{
	public abstract void m1();
}
class Tst1 extends Tst
{
	public void m1()
	{
		System.out.println("TST1 M1 METHOD");
	}
}
class Tst2 extends Tst
{
	public void m1()
	{
		System.out.println("TST2 CLASS METHOD");
	}
}
public class AbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //Tst t=new Tst();
		Tst1 t1=new Tst1();
		Tst2 t2=new Tst2();
		t1.m1();
		t2.m1();
	}

}
