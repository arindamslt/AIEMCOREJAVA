package InpuOutput;
import java.util.*;
public class InputOutputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   System.out.println("ENTER YOUR NAME");
   Scanner sc=new Scanner(System.in);
   String nm=sc.next();
   System.out.println("NAME:"+nm);
   System.out.println("ENTER YOUR AGE");
   int age=sc.nextInt();
   System.out.println("AGE:"+age);
   System.out.println("ENTER SALARY");
   double sal=sc.nextDouble();
   System.out.println("SALARY:"+sal);
   
	}

}
