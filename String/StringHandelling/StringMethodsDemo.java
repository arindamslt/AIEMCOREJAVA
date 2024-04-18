package StringHandelling;

public class StringMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s1="ARUPRAY";
      System.out.println(s1.length());
      System.out.println(s1.charAt(4));
      System.out.println(s1.substring(4,7));
      System.out.println(s1.lastIndexOf('A'));
      System.out.println(s1.indexOf('R'));
     String s2="ALOKE";
     System.out.println(s2.toLowerCase());
     System.out.println(s2.replace('E','A'));
     String s3=" suman ";
     System.out.println(s3);
     System.out.println(s3.trim());
     char[] arr=s2.toCharArray();
     for(int i=0;i<arr.length;i++)
     {
    	 System.out.println(arr[i]);
     }
     for(char j:arr)
     {
    	 System.out.println(j);
     }
     String s5="HOW ARE YOU,I AM FINE";
     String[] data=s5.split(",");
     for(String ss:data)
     {
    	 System.out.println(ss);
     }
     
     String s4=null;
     System.out.println(s4.length());
	}

}
