package Thread2.A1���߳�;

public class Goat implements Runnable 
{

	public void run() 
	{
		for(;;)
		{
			System.out.println("haha");
			try 
			{
				Thread.sleep(2000);
			} catch (InterruptedException e) 
			{
			}
		}
		
	}

}
