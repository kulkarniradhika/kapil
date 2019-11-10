
public interface generalization_simcards
{
	public void text();
	public void calling();
	
}
class idea implements generalization_simcards
{
	public void text()
	{
		System.out.println("100");
	}
	public void calling()
	{
		System.out.println("100");
	}
//	public void data()
//	{
//		System.out.println("1gb"); 
//	}

class jio implements generalization_simcards
{
	public void text()
	{
		System.out.println("200");
	}
	public void calling()
	{
		System.out.println("200");
	}
//	public void inetrnational_call()
//	{
//		System.out.println("50");
//	}
//	
}
class result
{
	public static void main(String[] args) {
		
		idea i=new idea();
		i.text();
		i.calling();
	
		
		
		jio j=new jio();
		j.text();
		j.calling();
		
	}
}
}
