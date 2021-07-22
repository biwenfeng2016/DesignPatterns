package Thread.semaphere;

import java.util.concurrent.Semaphore;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Semaphore sp=new Semaphore(3);//有三个许可
		Man gg=new Man(sp);
		Women mm=new Women(sp);
		gg.start();
		mm.start();
		// TODO Auto-generated method stub

	}

}

class Man extends Thread
{
	private Semaphore sp;
	public Man(Semaphore sp)
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
				
			}
		}
	}
}
class Women extends Thread
{
	private Semaphore sp;
	public Women(Semaphore sp)
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
			}
			catch(Exception ex)
			{
				
			}
		}
	}
}
