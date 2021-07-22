package Thread2.B多线程及其无序性;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hen h=new Hen();
		h.start(); //start调用的是run()
//		try 
//		{
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//		}

		Cock c=new Cock();
		c.start();
	}

}
