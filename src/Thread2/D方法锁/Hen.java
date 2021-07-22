package Thread2.D方法锁;

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

		int x=5;
		while(x<700000)
		{
//			System.out.println("Hen wait87888");
			x=4;
			x=4;
			x++;
			x++;
			x++;
			x++;
			x++;
			System.out.println("she将haha");
			this.w.haha();
			System.out.println("she哈哈了.............");
			x++;
			x++;
			x++;
			x++;
			try {
				Thread.sleep(2000);
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
