import java.util.Arrays;

public class arraydemo
{
	public static void main(String[] args) 
	{
//		int ar[]=new int[5];
//		ar[0]=10;
//		ar[1]=20;
//		ar[2]=30;
//		ar[3]=60;
//		ar[4]=90;
//		
//		for(int i=0;i<=ar.length-1;i++)
//		{
//			System.out.println(ar[i]);
//	}
		
		int ar[]= {10,20,40,44,33,40};
		for(int i=0;i<ar.length; i++)
		{
			System.out.println(ar [i]);
		}
		System.out.println();
         for(int i=ar.length-1;i>=0;i--)
		{
			System.out.println(ar[i]);
		}
		
		
	}

}


