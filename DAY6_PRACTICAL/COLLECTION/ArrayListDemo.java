package COLLECTION;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //ArrayList arr=new ArrayList();//by default size is 10
		Vector arr=new Vector();
   Integer n1=new Integer(10);//wrapper class
   Double d=new Double(15.5);
   arr.add(n1);
   arr.add(d);
   arr.add(new Integer(20));//annonymous object
   arr.add(new Integer(2));//annonymous object
   arr.add(new Integer(5));//annonymous object
   arr.add(n1);
   arr.add("SUMAN");
   arr.add("ROBIN");
   System.out.println(arr);
   //add to the 2nd position
   //arr.add(2,"RUPAM");
   System.out.println(arr);
   //remove a element
   //arr.remove(2);
   System.out.println(arr);
   //sort the arraylist
   System.out.println(arr);
  // Collections.sort(arr);
   System.out.println(arr);
   //TRAVERSE THE ELEMENTS IN ARRAY
   Iterator itr=arr.iterator();
   while(itr.hasNext())
   {
	   System.out.println(itr.next());
   }
   System.out.println("REVERSE DIRECTION=========");
   ListIterator ltr=arr.listIterator();
   while(ltr.hasNext())
   {
	   ltr.next();
   }
   while(ltr.hasPrevious())
   {
	   System.out.println(ltr.previous());
   }
	}

}
