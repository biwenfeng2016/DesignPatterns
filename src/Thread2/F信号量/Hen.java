package Thread2.F�ź���;

import java.util.concurrent.Semaphore;

public class Hen extends Thread 
{
	private Semaphore sp;
	public Hen(Semaphore sp)
	{
		this.sp=sp;
	}
	public void run()
	{
		while (true)
		{
			try
			{
				this.sp.acquire(3);
				System.out.println("���õõ�GG��������Ϣ");
				sleep(2000);
				System.out.println("���úܼ���");
				sleep(2000);
				System.out.println("���þ�����ͷ");
				sleep(2000);
				
				this.sp.release(2);
				sleep(2000);
				System.out.println("������������һ��");
				this.sp.release(1);
				sleep(2000);
			}
			catch(Exception ex)
			{
				
			}
		}
	}
}
