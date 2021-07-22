package Thread2.tmp;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Duck du=new Duck();
		Duck d=new Duck();
		du.start();
		d.start();
//		for(;;)
//		{
//			try {
//				Thread.sleep(600);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//			System.out.println("³úºÍÈÕµ±Îç");
//		}

	}

}
