package Thread2.D_������׼��;

public class Cock extends Thread {
	
	private Worm w;
	
	public Cock(Worm tmp)
	{
		this.w=tmp;
	}

	public void run()
	{
//		this.setPriority(4);
		int x=5;
		this.w.haha("����Ϊʲô������ô���۽�");

	}

}
