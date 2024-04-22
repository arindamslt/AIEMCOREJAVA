package COLLECTION;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashMap<String,Double> hp=new HashMap<String,Double>();
//LinkedHashMap<String,Double> hp=new LinkedHashMap<String,Double>();
TreeMap<String,Double> hp=new TreeMap<String,Double>();
		hp.put("TV",new Double(25000.00));
hp.put("TAB",new Double(18000.00));
hp.put("MOBILE",new Double(12000.00));
hp.put("LAPTOP",new Double(45000.00));
hp.put("CONVECTION",new Double(22000.00));
hp.put("TV",new Double(32000.00));
System.out.println(hp);
	}

}
