package Thread2.F�ź���;

import java.util.concurrent.Semaphore;

public class Cock extends Thread {
	private Semaphore sp;
	public Cock(Semaphore sp)
	{
		this.sp=sp;
	}
	public void run()
	{
		while (true)
		{
			try
			{
				this.sp.acquire(2);
				System.out.println("GG�õ����ô�������Ϣ�����Ҫ˼��3����");
				sleep(3000);
				System.out.println("GG������ˣ�GG������8���Է���ʾ�����ź�");
				sleep(8000);
				System.out.println("GG��һ��̬");
				this.sp.release(2);
				sleep(2000);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}
}
