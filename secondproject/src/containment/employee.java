package containment;

public class employee {
	
	private int empid;
	private String empname;
	Date date_joining;
	
	employee(){};
	
	employee(int empid, String empname, Date date_joining)
	{
		this.empid=empid;
		this.empname=empname;
		this.date_joining=date_joining;
	}
	
	public String toString()
	{
		return "Employee [ empid : "+empid+", empname : "+empname+", date_joining : "+date_joining;
	}
	
	public static void main(String arg[])
	{
		employee e=new employee(7, "Sahil", new Date(12,4,25));
	}
}
