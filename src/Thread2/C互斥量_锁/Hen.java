package Thread2.C互斥量_锁;
public class Hen extends Thread 
{
	private Worm w;
	public Hen(Worm tmp)
	{
		this.w=tmp;
	}
	public void run()
	{
		while(true)
		{
			synchronized(this.w)
			{
				System.out.println("母鸡");
				//如果没有睡眠，会打印个不停
				try 
				{
					sleep(2000);
				} 
				catch (InterruptedException e) 
				{
				}
			}
			try 
			{
				sleep(1);
			} 
			catch (InterruptedException e) 
			{
			}
		}
	}
}
