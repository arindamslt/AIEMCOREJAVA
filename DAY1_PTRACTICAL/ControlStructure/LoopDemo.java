package ControlStructure;

public class LoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  /* for(int i=1;i<=10;i++)
   {
	   System.out.println(i);
   }*/
		/*int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}*/
		/*int i=1;
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
	}*/
		for(int i=1;i<=10;i++)
		{
			if(i==3)
			{
				continue;
			}
			System.out.println(i);
		}
	

}
}
