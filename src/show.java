
public interface show 
{
	public void test1();
	
	}

	interface sample extends show
	{
		public void test2();
		 
	}
	class sample2 implements sample
	{
		public void test1()
		{
			System.out.println("complete test    1");
			
		}
		public void test2()
		{
			System.out.println("complete test    2");
		}
		
	}
	class demomain
	{
		public static void main(String[] args) {
			sample2 d=new sample2();
			d.test1();
			d.test2();
		}
	}


