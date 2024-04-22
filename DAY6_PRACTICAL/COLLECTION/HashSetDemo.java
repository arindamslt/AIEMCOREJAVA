package COLLECTION;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   HashSet hs=new HashSet();
   hs.add("ROBIN");
   hs.add("ARUP");
   hs.add("DIBENDU");
   hs.add("JAYANTA");
    hs.add("CHANDAN");
    hs.add("MANISH");
    hs.add("MANISH");
    System.out.println(hs);
    Iterator itr=hs.iterator();
    while(itr.hasNext())
    {
  	  System.out.println(itr.next());
  	  
    }
	}

}
