package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> arr=new ArrayList<Integer>();
arr.add(new Integer(10));
arr.add(new Integer(20));
arr.add(new Integer(30));
arr.add(new Integer(40));
//arr.add("AJOY");
//System.out.println(arr);
Iterator<Integer>  itr=arr.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}


	}

}
