package Thread2.B���̼߳���������;

public class Hen extends Thread 
{

	public void run()
	{
		while(true)
		{
			System.out.println("ĸ��");
			
			//���û��˯�ߣ����ӡ����ͣ
			try 
			{
				sleep(200);
			} catch (InterruptedException e) {
			}
		}
	}
}
