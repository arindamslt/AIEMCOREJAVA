package Oprerator;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x=10;
int y=15;
/*if(++x<10 & ++y>15)
{
	x++;
}
else
{
	y++;
}*/
/*if(++x<10 && ++y>15)
{
	x++;
}
else
{
	y++;
}*/
/*if(++x<10 | ++y>15)
{
	x++;
}
else
{
	y++;
}*/
if(++x<10 || ++y>15)
{
	x++;
}
else
{
	y++;
}
System.out.println("X:"+x);
System.out.println("Y:"+y);
	}

}
