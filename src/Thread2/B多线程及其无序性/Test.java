package Thread2.B���̼߳���������;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hen h=new Hen();
		h.start(); //start���õ���run()
//		try 
//		{
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//		}

		Cock c=new Cock();
		c.start();
	}

}
