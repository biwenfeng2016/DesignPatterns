package Thread2.F信号量;

import java.util.concurrent.Semaphore;

public class Cock extends Thread {
	private Semaphore sp;
	public Cock(Semaphore sp)
	{
		this.sp=sp;
	}
	public void run()
	{
		while (true)
		{
			try
			{
				this.sp.acquire(2);
				System.out.println("GG得到妹妹传来的消息，哥哥要思考3秒钟");
				sleep(3000);
				System.out.println("GG想清楚了，GG决定在8秒后对发出示爱的信号");
				sleep(8000);
				System.out.println("GG刚一表态");
				this.sp.release(2);
				sleep(2000);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
