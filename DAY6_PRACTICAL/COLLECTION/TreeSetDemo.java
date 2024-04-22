package COLLECTION;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedHashSet hs=new LinkedHashSet();
		TreeSet hs=new TreeSet();
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
