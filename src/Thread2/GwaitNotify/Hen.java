package Thread2.GwaitNotify;
public class Hen extends Thread 
{
	private Worm w;
	public Hen(Worm tmp)
	{
		this.w=tmp;
	}
	public void run()
	{
		while(true)
		{
			synchronized(this.w)
			{
				System.out.println("ĸ��");
				//���û��˯�ߣ����ӡ����ͣ
				try {
					this.w.wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				this.w.notify();
				System.out.println("ĸ��.......��û��С����");
				try 
				{
					sleep(2000);
				} 
				catch (InterruptedException e) 
				{
				}
			}
			try 
			{
				sleep(1);
			} 
			catch (InterruptedException e) 
			{
			}
		}
	}
}
