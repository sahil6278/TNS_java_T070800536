package secondproject;

public class B extends A 
{
	B()
	{
		System.out.println("This is class B");
	}
	B(int a)
	{
		System.out.println("This is class B "+a);
	}
	
	public static void main(String arg[])
	{
		B b=new B(2);
	}
}
