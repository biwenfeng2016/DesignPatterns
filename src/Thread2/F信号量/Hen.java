package Thread2.F信号量;

import java.util.concurrent.Semaphore;

public class Hen extends Thread 
{
	private Semaphore sp;
	public Hen(Semaphore sp)
	{
		this.sp=sp;
	}
	public void run()
	{
		while (true)
		{
			try
			{
				this.sp.acquire(3);
				System.out.println("妹妹得到GG传来的消息");
				sleep(2000);
				System.out.println("妹妹很激动");
				sleep(2000);
				System.out.println("妹妹决定点头");
				sleep(2000);
				
				this.sp.release(2);
				sleep(2000);
				System.out.println("妹妹想想再吐一个");
				this.sp.release(1);
				sleep(2000);
			}
			catch(Exception ex)
			{
				
			}
		}
	}
}
