package OOPS;
class Outers
{
	int x=65;
	class InnerDemo
	{
		int y=45;
		public void add()
		{
			int z;
			z=x+y;
			System.out.println("RESULT:"+z);
		}
	}
}
public class OuterInnerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Outers out=new Outers();
 Outers.InnerDemo in=out.new InnerDemo();
 in.add();
	}

}
