package ControlStructure;

public class ControlStructureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int marks=65;
    if(marks<=40)
    {
    	System.out.println("FAIL");
    }
    else if(marks>40 && marks<=50)
    {
    	System.out.println("GRADE:D");
    }
    else if(marks>50 && marks<=70)
    {
    	System.out.println("GRADE:C");
    	
    }
    else if(marks>70 & marks<=90)
    {
    	System.out.println("GRADE:B");
    }
    else
    {
    	System.out.println("GRADE:A");
    }
	}

}
