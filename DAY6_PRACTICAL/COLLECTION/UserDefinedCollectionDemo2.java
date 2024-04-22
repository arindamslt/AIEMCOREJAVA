package COLLECTION;

import java.rmi.StubNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class UserDefinedCollectionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap<Integer,Student> hp=new HashMap<Integer, Student>();
     Student s1=new Student();
     Student s2=new Student();
     s1.setSname("SUMAN");
     s1.setSdept("CSE");
     s2.setSname("AYAN");
     s2.setSdept("CSE");
     hp.put(1, s1);
     hp.put(2, s2);
     Set set=hp.entrySet();//copies map value to set
     Iterator itr=set.iterator();
     while(itr.hasNext())
     {
    	 Map.Entry me=(Map.Entry)itr.next();
    	 Student sds=(Student)me.getValue();
    	 System.out.println(me.getKey()+"===>"+sds.getSname()+"===>"+sds.getSdept());
     }
     
	}

}
