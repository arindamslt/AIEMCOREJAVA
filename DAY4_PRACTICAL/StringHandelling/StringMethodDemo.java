package StringHandelling;

public class StringMethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ALOKERAY";
		//checking the string is empty or not
		System.out.println(s1.isEmpty());
		//find out length of the string
		System.out.println(s1.length());
		//cut a perticular postion of chareceter of a string
		System.out.println(s1.charAt(5));
		//substring
		System.out.println(s1.substring(5,8));
		//System.out.println(s1.charAt(8));
		String s2=" SAMRAT ";
		System.out.println(s2);
	//remove leading and trailing spaces
		System.out.println(s2.trim());
		//Convert into lower case
		System.out.println(s2.trim().toLowerCase());
      //covert the string to charecter array
		char[] arch=s1.toCharArray();
		/*for(int i=0;i<arch.length;i++)
		{
			System.out.println(arch[i]);
		}*/
		//for each loop (it is a enhanced for loop)
		for(char c:arch)
		{
			System.out.println(c);
		}
		String str="HELLO,HOW ARE YOU,I AM FINE";
		String[] st=str.split(",");
		for(String ss:st)
		{
			System.out.println(ss);
		}
	}

}
