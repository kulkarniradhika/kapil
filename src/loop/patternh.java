package loop;

public class patternh
{
	public static void main(String[] args) {
		
	
	for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=i;j++)
		{
			if(i==j)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
		}
		System.out.println();
	}

}
}