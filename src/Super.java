
public class Super
{
	String color="black" ;

}
class dog extends Super
{
	String color="white";
			public void color()
			{
		System.out.println(color);
		System.out.println(super.color);
			}
}
class colormain
{
	public static void main(String[] args) {
		
		dog d=new dog();
		d.color();
	}
}
