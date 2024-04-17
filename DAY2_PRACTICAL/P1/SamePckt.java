package P1;
class Test
{
	public int x=10;
	private int y=20;
	protected int z=30;
	int d=40;
	public void show_x()
	{
		System.out.println("X:"+x);
	}
	private void show_y()
	{
		System.out.println("Y:"+y);
	}
	protected void show_z()
	{
		System.out.println("Z:"+z);
	}
	void show_d()
	{
		System.out.println("D:"+d);
	}
}
public class SamePckt extends Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   SamePckt sp=new SamePckt();
   sp.show_d();
   sp.show_x();
   sp.show_z();
	}

}
