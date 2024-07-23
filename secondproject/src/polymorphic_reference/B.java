package polymorphic_reference;

public class B extends A
{
	public void m1()
	{
		System.out.println("this is m1 of B ");
	}
	
	public void m2()
	{
		System.out.println("this is m2 of B ");
	}
	
	public static void main(String arg[])
	{
		A a=new B(); //polymorphic reference
		a.m1();
		((B) a).m2();  //downcasting reference from super to sub
		
		A a1=new A();
		B b=new B();

		
		System.out.println(a instanceof B);
		System.out.println(a1 instanceof B);
		System.out.println(b instanceof B);
		System.out.println(a instanceof A);
		
	}
}
