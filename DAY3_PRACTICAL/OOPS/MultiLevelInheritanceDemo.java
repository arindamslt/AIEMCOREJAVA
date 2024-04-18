package OOPS;
class Student
{
	public int rollno=1;
	public String sname="ARUP";
	public void show()
	{
		System.out.println("ROLLNO:"+rollno);
		System.out.println("NAME:"+sname);
	}
}
class Exam extends Student
{
	public String sub1="PHYS";
	public String sub2="CHEM";
	public String sub3="MATH";
	public void display()
	{
		System.out.println("SUBJECT1:"+sub1);
		System.out.println("SUBJECT2:"+sub2);
		System.out.println("SUBJECT3:"+sub3);
	}
	public int score(int p,int c,int m)
	{
		return(p+c+m);
	}
}
class PersonalInfo extends Exam
{
	public String deptnm="CSE";
	public String sem="IVTH";
	public String phno="54545";
	public void info()
	{
		System.out.println("DEPTNM:"+deptnm);
		System.out.println("SEM:"+sem);
		System.out.println("PHONE NO:"+phno);
	}
}
public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PersonalInfo pi=new PersonalInfo();
pi.show();
pi.display();
pi.info();
int total=pi.score(80,90,95);
System.out.println("TOTAL MARKS:"+total);
	}

}
