package Thread2.D������;
/**
 * ����
 * @author Administrator
 *
 */
public class Worm 
{

	public synchronized void haha()
	{
//		System.out.println("wawa1");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("6...........");
	}
}
