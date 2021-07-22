package Thread.easyMultiThread;

public class Test{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread a=new MyThread("a",5000);
		MyThread b=new MyThread("b",2000);
		a.start();
		b.start();
		
	}
}
