package MyThread1.simpleThread;

public class ProductAndConsumer {

    public static void main(String[] args) {
        Data data = new Data();
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

class Data {

    private int number = 0;

    public synchronized void increment() throws InterruptedException {
        if (number != 0) {

            this.wait();

        }
        number++;
        System.out.println("number = " + number);

        this.notifyAll();
    }

    public synchronized void decrement() throws InterruptedException {
        if (number == 0) {

            this.wait();

        }
        number--;
        System.out.println("number = " + number);
        this.notifyAll();
    }


}



