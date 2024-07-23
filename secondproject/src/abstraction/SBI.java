package abstraction;

public class SBI extends bank
{
	public void get()
	{
		System.out.println("this is get method : ");
	}
	
	public static void main(String arg[])
	{
		SBI s=new SBI();
		s.set();
		bank b=new SBI();
		b.get();
	}

}
