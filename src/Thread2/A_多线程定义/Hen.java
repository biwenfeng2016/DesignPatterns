package Thread2.A_多线程定义;

public class Hen extends Thread 
{
//start()  run()
	/**run由start()来调用，表示另起线程。  
	 * 用start（）
	 * {
	 * fasdk;lfasd
	 * ksdl;ajfsd
	 * run();
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 新启动线程的时候，新线程里运行的东西是run()中的东西。
	 */
//	public void run()
//	{
//		while(true)
//		{
//			System.out.println("母鸡");
//			
//			//如果没有睡眠，会打印个不停
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
			System.out.println("子函数");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
