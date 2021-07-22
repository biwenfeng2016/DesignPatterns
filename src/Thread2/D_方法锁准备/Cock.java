package Thread2.D_方法锁准备;

public class Cock extends Thread {
	
	private Worm w;
	
	public Cock(Worm tmp)
	{
		this.w=tmp;
	}

	public void run()
	{
//		this.setPriority(4);
		int x=5;
		this.w.haha("公鸡为什么总是那么的雄健");

	}

}
