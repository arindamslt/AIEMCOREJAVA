package OOPS;
abstract class Shapes
{
	public abstract void area(double r);
}
 class Circles extends Shapes
{
	public void area(double r)
	{
		System.out.println("CIRCLE AREA:"+Math.PI*r*r);
	}
}
 class Squares extends Shapes
 {
	public void area(double r)
	{
		System.out.println("SQUARE AREA:"+(r*r));
	}
 }
public class DynamicBindingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Shapes sp1;//Object Reference
     Shapes sp2;
     Circles cr=new Circles();
     Squares sq=new Squares();
     sp1=cr;
     sp2=sq;
     sp1=sp2;//dynamic binding
     sp1.area(5.0);
     
     
     
     
	}

}
