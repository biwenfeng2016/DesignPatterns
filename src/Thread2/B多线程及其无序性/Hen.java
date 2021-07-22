package Thread2.B多线程及其无序性;

public class Hen extends Thread 
{

	public void run()
	{
		while(true)
		{
			System.out.println("母鸡");
			
			//如果没有睡眠，会打印个不停
			try 
			{
				sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}
