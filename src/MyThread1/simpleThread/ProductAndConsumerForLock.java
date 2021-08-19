package MyThread1.simpleThread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ProductAndConsumerForLock {

    public static void main(String[] args) {
        DataForLock data = new DataForLock();
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    data.increment();
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "A").start();
        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    data.decrement();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "B").start();

    }


}

class DataForLock {

    private int number = 0;

    Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void increment() throws InterruptedException {



        try {
            lock.lock();
            if (number != 0) {
                condition.await();
            }
            number++;
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        System.out.println("number = " + number);


    }

    public void decrement() throws InterruptedException {

        try {
            lock.lock();

            if (number == 0) {
                condition.await();
            }
            number--;
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
        System.out.println("number = " + number);


    }


}



