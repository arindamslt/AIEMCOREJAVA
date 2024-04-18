package EXCEPTION;
class Account
{
	String accno="100";
	public void checkAccNo(String acno)
	{
		try
		{
		if(accno.equals(acno))
		{
			System.out.println("ACCOUNT EXISTS");
		}
		else
		{
			AccountNotFoundException ac=new AccountNotFoundException();
			throw ac;
		}
		}
		catch(AccountNotFoundException ac)
		{
			ac.printStackTrace();
		}
	}
}
public class UserDefinedExceptionDemos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Account acn=new Account();
   acn.checkAccNo("100");
	}

}
