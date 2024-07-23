package Assignment;

public class Factorial extends Processor 
{
	@Override
	public int process(int data) {
		int result=1;
		for(int i=1; i<=data; i++)
		{
			result=result*i;
		}
		return result;
	}
	public static void main(String arg[])
	{
		Factorial f=new Factorial();
		int ans=f.process(4);
		System.out.println(ans);
	
	}
}
