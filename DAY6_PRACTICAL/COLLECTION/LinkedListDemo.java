package COLLECTION;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LinkedList ls=new LinkedList();
  ls.add("AYAN");
  ls.add("ALOKE");
  ls.add("RAJAT");
  ls.add(new Integer(10));
  ls.add(new Double(15.5));
  Iterator itr=ls.iterator();
  while(itr.hasNext())
  {
	  System.out.println(itr.next());
	  
  }
	}

}
