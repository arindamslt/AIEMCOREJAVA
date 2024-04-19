package StringHandelling;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s1=new String("AJOY");//immutable
   s1.concat("SHARMA");
   s1.concat("KOLKATA");
   System.out.println(s1);
   StringBuffer sb=new StringBuffer("AJOY");//muttable
   sb.append("SHARMA");
   sb.append("KOLKATA");
   System.out.println(sb);
	}

}
