package Thread2.A_���̶߳���;

import java.util.Scanner;


public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
		int x=5;
		x++;
		System.out.println("��һ��");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
//			for(int j=0;j<100000;j++)
//			{
		x++;
//			}
		}
		Hen h=new Hen();
		h.start(); //start���õ���run()
		s.next();//�����
//		
//		
//		/**
//		 * �������
//		 */
//		for(int i=0;i<100000;i++)
//		{
//			for(int j=0;j<100000;j++)
//			{
//				x++;
//				
//			}
//		}
		System.out.println("��2��");
	}


}
