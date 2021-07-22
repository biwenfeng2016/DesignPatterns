package Thread2.F信号量;

import java.util.concurrent.Semaphore;


public class Test 
{
	public static void main(String[] args) 
	{
		Semaphore sp=new Semaphore(3);//有三个许可
		Cock gg=new Cock(sp);
		Hen mm=new Hen(sp);
		gg.start();
		mm.start();
	}

}
