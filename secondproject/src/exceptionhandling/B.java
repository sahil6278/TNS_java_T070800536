package exceptionhandling;
import java.io.FileOutputStream;
public class B {
	
	public static void main(String arg[]) throws Exception
	{
		FileOutputStream fos=null;
		try
		{
			fos=new FileOutputStream("D:\\eclipse-jee-2023-12-R-win32-x86_64\\eclipse\\demo.txt"); 
			String str="Welcome to JSPM ";
			byte[] b=str.getBytes();
			fos.write(b);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("In finally");
			fos.close();
		}
	}
}
