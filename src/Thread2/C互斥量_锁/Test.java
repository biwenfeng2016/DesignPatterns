package Thread2.C������_��;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worm ss=new Worm();//����
		Hen h=new Hen(ss);
		Cock c=new Cock(ss);
		h.start(); 

		c.start();
	}

}
