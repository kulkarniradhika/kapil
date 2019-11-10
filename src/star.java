
public class star
{
	public static void main(String[] args) {
		
	
	for(int i=1;i<=4;i++)
	{
		for(int j=3;j>=i-1;j--)
		{
			if(i>=1 && j<=i-1)
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
