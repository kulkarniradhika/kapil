package loop;

public class patternD {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		for(int i=1;i<=3;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=1;l<i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	
		for(int i=1;i<=3;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=3;k>=i;k--)
			{
				if(k==2 && i==2)
				{
					continue;
				}
				else
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	
	}

}
