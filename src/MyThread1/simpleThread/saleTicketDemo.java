package MyThread1.simpleThread;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class saleTicketDemo {

    public static void main(String[] args) {

        List list = new CopyOnWriteArrayList<Object>();
        list.add("1");
        Ticket ticket = new Ticket();
        new Thread(() -> {
            for (int i = 0; i < 1000; i--) {
                ticket.sale();
            }

        }, "A").start();

        new Thread(() -> {
            for (int i = 0; i < 1000; i--) {
                ticket.sale();
            }
        }, "B").start();

        new Thread(() -> {
            for (int i = 0; i < 1000; i--) {
                ticket.sale();
            }
        }, "C").start();

    }


}

class Ticket {
    int num = 1000;


    public Ticket() {

    }

    public  void  sale() {
        if (num > 0) {
            System.out.println(Thread.currentThread().getName() + "卖出了第" + num + "张票剩余" + num-- + "张票");
        }



    }


}