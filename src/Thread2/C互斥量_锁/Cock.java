package Thread2.C互斥量_锁;

public class Cock extends Thread {
	private Worm w;
	
	public Cock(Worm tmp)
	{
		this.w=tmp;
	}

	public void run()
	{
		while(true)
		{
			System.out.println();
			synchronized(this.w)
			{
	
				System.out.println("我是公鸡好不好？");
				
				//如果没有睡眠，会打印个不停 同步
				try 
				{
					sleep(1000);
				} catch (InterruptedException e) {
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
