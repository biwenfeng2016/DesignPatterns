package Thread.synchoronize;

import java.util.concurrent.locks.Lock;   
import java.util.concurrent.locks.ReentrantLock;   
  
  
public class DownLoad {   
  
    public Object Olock = new Object();   
    Lock lock = new ReentrantLock();   
    public synchronized  void methodA(){   //�������Ͷ�����һ�£���ס��������������ˣ�����ֻ�иɰͰ͵ȴ�   
        //System.out.prinltn("Hello World");   
    }   
       
    public  void methodB(){   //������   
        synchronized(this){   
            //System.out.prinltn("Hello World");   
        }   
    }   
       
    public  void methodC(){   //������   
        synchronized(lock){   
            //System.out.prinltn("Hello World");   
        }   
    }   
       
    public void methodD(){   //û�õ���   
        Object templock = new Object();   
        synchronized(templock){   
            //System.out.prinltn("Hello World");   
        }   
    }   
       
    public static synchronized void methodE(){  //class��    
        //System.out.prinltn("Hello World");   
    }   
       
    public  void methodF(){   //������   
        lock.lock();   
        //System.out.prinltn("Hello World");   
        lock.unlock();   
    }   
}  
