package threadPoolExcutor;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolDemo {

    public static void main(String[] args) {

        ThreadPoolExecutor pool = new ThreadPoolExecutor(10, 30, 60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(5), Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());

        // if ArrayBlockingQueue.capacity + maximumPoolSize > task num ,eg. here i<36 ,
        // then will go to RejectedExecutionHandler
        for (int i = 0; i < 200; i++) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            pool.execute(new MyTask(i));
        }
    }
}

class MyTask implements Runnable {
    int i;

    public MyTask(int i) {
        this.i = i;

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "--" + i);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
