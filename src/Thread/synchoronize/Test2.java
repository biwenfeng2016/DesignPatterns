package Thread.synchoronize;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    Hen lock = new Hen();   
		Man2 gg=new Man2(lock);
		Women2 mm=new Women2(lock);
		gg.start();
		mm.start();
		// TODO Auto-generated method stub

	}

}
class Man2 extends Thread
{
	private Hen hen;
	public Man2(Hen hen)
	{
		this.hen=hen;
	}
	public void run()
	{
		while (true)
		{
			try
			{
				synchronized(this.hen)
				{
					System.out.println("GG˼���С���");
					sleep(4000);
					System.out.println("GG˼������");
				}
			}
			catch(Exception ex)
			{
				
			}
		}
	}
}
class Women2 extends Thread {
	private Hen hen;
	public Women2(Hen hen)
	{
		this.hen=hen;
	}
	public void run()
	{
		while (true)
		{
			try
			{
				synchronized(this.hen)
				{
					System.out.println("����ռ��cpu����");
					sleep(2000);
					System.out.println("����ռ��CPU����");
				}
			}
			catch(Exception ex)
			{
				
			}
		}
	}
}

