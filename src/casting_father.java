
public class casting_father 
{
	public void money()
	{
		System.out.println("100");
	}
	public void home()
	{
		System.out.println("home");
	}
	}
class son extends casting_father
{
	public void money()
	{
		System.out.println("5");
	}
	public void bike()
	{
		System.out.println("bike");
	}
	
}
class samplemain
{
	public static void main(String[] args) {
		
	
	casting_father s=new son();
	s.money();
	s.home();
}
}
