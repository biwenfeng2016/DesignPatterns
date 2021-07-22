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
					System.out.println("GG思考中……");
					sleep(4000);
					System.out.println("GG思考结束");
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

