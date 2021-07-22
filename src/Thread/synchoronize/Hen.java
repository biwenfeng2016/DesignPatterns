package Thread.synchoronize;

public class Hen 
{
	public synchronized void fly(String name)
	{
		try {
			System.out.println(name+"思考中……");
			Thread.sleep(4000);
			System.out.println(name+"思考结束");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
