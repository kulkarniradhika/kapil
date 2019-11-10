
public class Stringprograms 
{
	public static void main(String[] args) 
	{
		String s1="hello"; 
		String s2="whatsuph";
		String s3="samiran";
		
      System.out.println(s1.toUpperCase());
		System.out.println(s2.indexOf('h'));
		System.out.println(s3.startsWith("sa"));
		System.out.println(s2.endsWith("up"));
		System.out.println(s2.lastIndexOf("h"));
		System.out.println(s3.charAt(3));
		System.out.println(s2.length());
		System.out.println(s2.isEmpty());
		System.out.println(s3.substring(2));
		System.out.println(s3.substring(0, 3));
		System.out.println(s2.equals(s1));
		System.out.println(s2.equalsIgnoreCase(s3));
		System.out.println(s3.contains(s1));
		System.out.println(s2.contains(s3));
		System.out.println(s3.split("i"));
		System.out.println(s3.replace('m', 'k'));
		System.out.println(s2.concat(s1));
		
		
		
	}

}
