package Thread2.F�ź���;

import java.util.concurrent.Semaphore;


public class Test 
{
	public static void main(String[] args) 
	{
		Semaphore sp=new Semaphore(3);//���������
		Cock gg=new Cock(sp);
		Hen mm=new Hen(sp);
		gg.start();
		mm.start();
	}

}
