package Thread.synchoronize;

public class Hen 
{
	public synchronized void fly(String name)
	{
		try {
			System.out.println(name+"˼���С���");
			Thread.sleep(4000);
			System.out.println(name+"˼������");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
