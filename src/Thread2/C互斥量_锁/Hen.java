package Thread2.C������_��;
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
