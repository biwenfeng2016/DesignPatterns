package Thread2.D方法锁;

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
		while(x<700000)
		{
			x=4;
			x++;
			x++;
			x++;
			x++;
			x++;
			System.out.println("公鸡将哈哈");
			this.w.haha();
			System.out.println("公鸡哈哈了...........");
			x++;
			x++;
			x++;
			x++;			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			x++;
			x++;
			x++;
			x++;

		}
	}

}
