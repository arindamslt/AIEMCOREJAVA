package OOPS;
class Tests implements Inter1
{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("INTERFACE DEMO");
	}
	
}
public class TestImplDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Tests t=new Tests();
  t.show();
	}

}
