package Thread2.D_������׼��;

public class Test {

	/**
	 * �������˵����������ĸ����ͬһʱ������ͬһ�������haha()
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Worm ss=new Worm();
//		Worm ss1=new Worm();
		Hen h=new Hen(ss);
		Cock c=new Cock(ss);
		h.start(); 

		c.start();
	}

}
