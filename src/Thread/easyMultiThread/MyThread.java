package Thread.easyMultiThread;

public class MyThread extends Thread {

	private String name="";
	private int time=0;
	public MyThread()
	{
		
	}
	public MyThread(String name,int time)
	{
		this.name=name;
		this.time=time;
	}
	public void run()
	{
		for(;;)
		{
			System.out.println("我这是线程:"+this.name);
			try {
				sleep(this.time);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}
}
