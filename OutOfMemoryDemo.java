package week3;

public class OutOfMemoryDemo {
	public static void main(String[]args)
	{
		try
		{
			int[]big=new int[1000*1000*1000];
		}
		catch(OutOfMemoryError e)
		{
			System.out.println("your Entered Value is Out of heap Memory");
			
		}
	}
	

}
