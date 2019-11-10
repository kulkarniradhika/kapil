
public class abc
{
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{
			for(int j=2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++)
			{
				System.out.print("*");
			}
			for(int l=2;l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=3;i++)
		{  
		for(int m=1;m<=i;m++)
		{
			System.out.print(" ");
		}
		for(int p=2;p>=i;p--)
		{
			System.out.print("*");
		}
		for(int q=1;q>=i;q--)
		{
			System.out.println("*");
		}
		
	}

}
}