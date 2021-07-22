package Thread2.tmp;

public class Duck extends Thread 
{
	public int age;
	@Override 
	public void run()
	{
		age=(int)(100*Math.random());
		System.out.println(333333);
		for(int i=0;;i++)
		{
			System.out.println(age);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
