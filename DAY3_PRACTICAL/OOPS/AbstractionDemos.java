package OOPS;
abstract class Shape
{
	public abstract void area(double r);
}
 class Circle extends Shape
{
	public void area(double r)
	{
		System.out.println("CIRCLE AREA:"+Math.PI*r*r);
	}
}
 class Square extends Shape
 {
	public void area(double r)
	{
		System.out.println("SQUARE AREA:"+(r*r));
	}
 }
 class Triangle extends Shape
 {
	 public void area(double r)
	 {
		 System.out.println("TRIANGLE AREA:"+(0.5*r*r));
	 }
 }
public class AbstractionDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Circle cr=new Circle();
    Square sq=new Square();
    Triangle tr=new Triangle();
    cr.area(5.0);
    sq.area(5.0);
    tr.area(5.0);
    
    
    
	}

}
