package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;

public class UserDefinedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
Product p1=new Product();
Product p2=new Product();
p1.setPname("TV");
p1.setPrice(25000.00);
p2.setPname("LAPTOP");
p2.setPrice(45000.00);

ArrayList<Product> arr=new ArrayList<Product>();
arr.add(p1);
arr.add(p2);
Iterator<Product> itr=arr.iterator();
while(itr.hasNext())
{
	Product pds=(Product)itr.next();
	System.out.println(pds.getPname()+"===>"+pds.getPrice());
}
	}

}
