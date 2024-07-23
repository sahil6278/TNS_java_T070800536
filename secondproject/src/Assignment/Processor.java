package Assignment;

public abstract class Processor 
{
	int data;
	public abstract int process(int data);
	public void showData()
	{
		System.out.println("Data : "+data);
	}
	

}
