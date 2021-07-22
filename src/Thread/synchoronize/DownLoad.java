package Thread.synchoronize;

import java.util.concurrent.locks.Lock;   
import java.util.concurrent.locks.ReentrantLock;   
  
  
public class DownLoad {   
  
    public Object Olock = new Object();   
    Lock lock = new ReentrantLock();   
    public synchronized  void methodA(){   //方法锁和对象锁一致，锁住对象，他就是你的了，别人只有干巴巴等待   
        //System.out.prinltn("Hello World");   
    }   
       
    public  void methodB(){   //对象锁   
        synchronized(this){   
            //System.out.prinltn("Hello World");   
        }   
    }   
       
    public  void methodC(){   //对象锁   
        synchronized(lock){   
            //System.out.prinltn("Hello World");   
        }   
    }   
       
    public void methodD(){   //没用的锁   
        Object templock = new Object();   
        synchronized(templock){   
            //System.out.prinltn("Hello World");   
        }   
    }   
       
    public static synchronized void methodE(){  //class锁    
        //System.out.prinltn("Hello World");   
    }   
       
    public  void methodF(){   //互斥锁   
        lock.lock();   
        //System.out.prinltn("Hello World");   
        lock.unlock();   
    }   
}  
