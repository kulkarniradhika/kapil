
public interface _interface2
{
	public void test2();

}

interface _interface3
{
	public void test3();	
}


	class demo3 implements _interface2,_interface3
	{
	
		public void test3()
		{
	
	System.out.println("complete test3");
		}
		public void test2()
		{
	System.out.println("complete test2");
		}
		public static void main(String[] args) {
			demo3 d=new demo3();
			d.test2();
			d.test3();
		}
}
