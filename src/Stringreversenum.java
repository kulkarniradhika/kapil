
public class Stringreversenum
{
	public static void main(String[] args) {
		String originalnum= "12345";
		String original=Integer.toString( originalnum);
		String reverse="";
		
		for(int i=original.length();i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		
		int reversenum = Integer.parseInt(reverse);
		
		System.out.println(reversenum);
		
	}

}
