package Thread.semaphere;

import java.util.concurrent.Semaphore;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Semaphore sp=new Semaphore(3);//���������
		Man gg=new Man(sp);
		Women mm=new Women(sp);
		gg.start();
		mm.start();
		// TODO Auto-generated method stub

	}

}

class Man extends Thread
{
	private Semaphore sp;
	public Man(Semaphore sp)
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
				
			}
		}
	}
}
class Women extends Thread
{
	private Semaphore sp;
	public Women(Semaphore sp)
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
			}
			catch(Exception ex)
			{
				
			}
		}
	}
}
