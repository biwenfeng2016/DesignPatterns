package Thread.synchoronize;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    Lock lock = new ReentrantLock();   
		Man gg=new Man(lock);
		Women mm=new Women(lock);
		gg.start();
		mm.start();
		// TODO Auto-generated method stub

	}

}
class Man extends Thread
{
	private Lock lock;
	private int id=0;
	public Man(Lock lock)
	{
		this.id=0;
		this.lock=lock;
	}
	public void run()
	{
		this.id++;
		int s=this.id;
		while (true)
		{
			try
			{
				synchronized(this.lock)
				{
					System.out.println("GG"+s+"思考中……");
					sleep(4000);
					System.out.println("GG"+s+"思考结束");
				}
			}
			catch(Exception ex)
			{
				
			}
		}
	}
}
class Women extends Thread {
	private Lock lock;
	public Women(Lock lock)
	{
		this.lock=lock;
	}
	public void run()
	{
		while (true)
		{
			try
			{
				synchronized(this.lock)
				{
					System.out.println("妹妹占用cpu……");
					sleep(2000);
					System.out.println("妹妹占用CPU结束");
				}
			}
			catch(Exception ex)
			{
				
			}
		}
	}
}

