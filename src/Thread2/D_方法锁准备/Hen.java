package Thread2.D_������׼��;

public class Hen extends Thread 
{

	private Worm w;
	
	public Hen(Worm tmp)
	{
		this.w=tmp;
	}
	
	public void run()
	{
//		this.setPriority(2);
		this.w.haha("�µ��µ�");

		
	}
}
