package Thread2.A_多线程定义;

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
		System.out.println("第一步");
		Scanner s=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
//			for(int j=0;j<100000;j++)
//			{
		x++;
//			}
		}
		Hen h=new Hen();
		h.start(); //start调用的是run()
		s.next();//会堵死
//		
//		
//		/**
//		 * 不会堵死
//		 */
//		for(int i=0;i<100000;i++)
//		{
//			for(int j=0;j<100000;j++)
//			{
//				x++;
//				
//			}
//		}
		System.out.println("第2步");
	}


}
