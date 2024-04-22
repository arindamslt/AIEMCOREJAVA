package COLLECTION;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Stack st=new Stack();
   st.add("ANUP");
   st.add("RAMAN");
   st.add("ANIRBAN");
   st.add("SAIKAT");
   st.add("ANIRBAN");
   System.out.println(st);
   st.push("ROHIT");
   System.out.println(st);
   st.pop();
   System.out.println(st);
   System.out.println(st.peek());
   System.out.println(st);
	}

}
