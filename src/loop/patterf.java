package loop;

public class patterf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=4;i++)
        {
        	for(int j=4;j>=i;j--)
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
        	for(int k=1;k<=i;k++)
        	{
        		if(i==k)
        		{
        			  System.out.print("*"); 
        		}
        		else
        		{
        		
            		System.out.print("  q	");
        		}
        	}
			/*
			 * for(int k=3;k==i;k--) { System.out.print("*"); }
			 */
        	System.out.println();
        }
        for(int i=1;i<=4;i++)
        {
        	for(int j=1;j<=4;j++)
        	{
        		if(i==j)
        		{
        			  System.out.print("*"); 
        		}
        		else {
            		System.out.print(" ");

        		}
        	}
        	for(int k=4;k>=1;k--)
        	{
        		if(i==k)
        		{
        			  System.out.print("*"); 
        		}
        		else {
            		System.out.print(" ");

        		}
        	}
			/*
			 * for(int k=3;k==i;k--) { System.out.print("*"); }
			 */
        	System.out.println();
        }
	}

}
