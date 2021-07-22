package Thread2.D_方法锁准备;

public class Test {

	/**
	 * 这个故事说明，公鸡和母鸡在同一时间运行同一个对象的haha()
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
