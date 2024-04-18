package EXCEPTION;
class Calculator
{
	int x=25;
     int y=0;
     public void result()
     {
    	 try
    	 {
    	    int z;
    	    z=x/y;
    	   System.out.println("THE RESULT:"+z);
    	   //System.out.println("Y:"+y);
    	 }
    	 
    	 catch(ArithmeticException ae)
    	 {
    		 //ae.printStackTrace();
    		 //System.out.println(ae);
    		 System.out.println(ae.getMessage());
    	 }
    	 catch(Exception ex)
    	 {
    		 //ex.printStackTrace();
    		 //System.out.println(ex);
    		 System.out.println(ex.getMessage());
    	 }
    	 finally
    	 {
    		 System.out.println("ALWAYS EXECUTED");
    	 }
    	
     }
     public void m1()
     {
    	 System.out.println("X:"+x);
     }
}

public class UnCheckedExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Calculator c=new Calculator();
c.result();
c.m1();
	}

}
