package Thread2.B���̼߳���������;

public class Cock extends Thread {
	public void run()
	{
		while(true)
		{
			System.out.println("���ǹ����ò��ã�");
			
			//���û��˯�ߣ����ӡ����ͣ
			try 
			{
				sleep(200);
			} 
			catch (InterruptedException e) 
			{
			}
		}
	}

}
