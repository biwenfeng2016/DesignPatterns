package Thread2.A_���̶߳���;

public class Hen extends Thread 
{
//start()  run()
	/**run��start()�����ã���ʾ�����̡߳�  
	 * ��start����
	 * {
	 * fasdk;lfasd
	 * ksdl;ajfsd
	 * run();
	 * 
	 * }
	 * 
	 * 
	 * 
	 * �������̵߳�ʱ�����߳������еĶ�����run()�еĶ�����
	 */
//	public void run()
//	{
//		while(true)
//		{
//			System.out.println("ĸ��");
//			
//			//���û��˯�ߣ����ӡ����ͣ
//			try 
//			{
//				sleep(2000);
//			} catch (InterruptedException e) {
//			}
//		}
//	}
	@Override
	public void run()
	{
		System.out.println(this.getPriority());
		for(int i=0;;i++)
		{
			System.out.println("�Ӻ���");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
