package Thread2.C������_��;

public class Cock extends Thread {
	private Worm w;
	
	public Cock(Worm tmp)
	{
		this.w=tmp;
	}

	public void run()
	{
		while(true)
		{
			System.out.println();
			synchronized(this.w)
			{
	
				System.out.println("���ǹ����ò��ã�");
				
				//���û��˯�ߣ����ӡ����ͣ ͬ��
				try 
				{
					sleep(1000);
				} catch (InterruptedException e) {
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
