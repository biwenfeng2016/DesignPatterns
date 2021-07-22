package Thread.synchoronize;

public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    Hen lock = new Hen();   
	    People gg=new People(lock,"gg");
	    People mm=new People(lock,"mm");
		gg.start();
		mm.start();
		// TODO Auto-generated method stub

	}

}
class People extends Thread
{
	private Hen hen;
	private String name;
	public People(Hen lock,String name)
	{
		this.hen=lock;
		this.name=name;
	}
	public void run()
	{
		while (true)
		{
			try
			{
				Cock.eat(this.name);
				this.hen.fly(this.name);
//				this.haha();
			}
			catch(Exception ex)
			{
				
			}
		}
	}
	public synchronized void haha()
	{
		
	}

}

