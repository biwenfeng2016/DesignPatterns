package Thread2.D_方法锁准备;

public class Hen extends Thread 
{

	private Worm w;
	
	public Hen(Worm tmp)
	{
		this.w=tmp;
	}
	
	public void run()
	{
//		this.setPriority(2);
		this.w.haha("下蛋下蛋");

		
	}
}
