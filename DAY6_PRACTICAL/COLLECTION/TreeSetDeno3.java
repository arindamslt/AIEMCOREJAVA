package COLLECTION;

import java.util.TreeSet;

public class TreeSetDeno3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet ts=new TreeSet(new TestComparator());
		ts.add(new Integer(10));
		ts.add(new Integer(20));
		ts.add(new Integer(30));
		ts.add(new Integer(40));
		ts.add(new Integer(0));
		ts.add(new Integer(50));
		System.out.println(ts);

	}

}
