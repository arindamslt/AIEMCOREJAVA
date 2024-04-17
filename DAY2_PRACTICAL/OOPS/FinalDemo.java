package OOPS;
final class Parent12
{
	public final void show()
	{
		System.out.println("I AM IN PARENT CLASS");
	}
}
class Child12 extends Parent12
{
	public void show()
	{
		System.out.println("I AM IN CHILD CLASS");
	}
}
public class FinalDemo {

	public static void main(String[] args) {
		// T  ChiODO Auto-generated method stub
   Child12 ch=new Child12();
   ch.show();
	}

}
