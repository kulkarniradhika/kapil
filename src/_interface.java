
public interface _interface
{
	public void test1();
	public void test2();
	
}

class demo
{
	public void test1()
	{
		System.out.println("complete test1");
	}
	public void test2()
	{
		System.out.println("complete test2");
	}
}

class demo2
{
	public static void main(String[] args) {
		demo d=new demo();
		d.test1();
		d.test2();
	}
}