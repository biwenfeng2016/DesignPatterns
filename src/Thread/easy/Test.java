package Thread.easy;
import java.util.Scanner;
public class Test {

	/**
	 * @param args ��������������
	 * @return  ԭ�ӵ���ը
	 * @throws 
	 * semaphore
	 * acquire
	 * release
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test mm=new Test();
		Scanner aaa=new Scanner(System.in);
		for(int i=0;i<100;i++)
		{
			String ss=aaa.next();
			mm.haha(ss);
		}
	}
	public void haha(String ss)
	{
		System.out.println("haha"+ss);
	}

}
