package threads;

public class MyThread3 implements Runnable {

    private int counter;
    private String threadName;

    public MyThread3(String threadName) {
        this.threadName = threadName;
        this.counter = 0;
    }

    @Override
    public void run() {
        System.out.println(threadName + " startuje");
        try {
            do {
                Thread.sleep(500);
                System.out.println(threadName + ", counter " + counter);
                counter++;
            } while (counter <= 10);
        } catch (InterruptedException exception) {
            System.out.println(threadName + " został przerwany");
        }

        System.out.println(threadName + " został zakończony");
    }

    public static void main(String[] args) {
        System.out.println("Główny wątek startuje");

        MyThread3 runnable1 = new MyThread3("Wątek 1");
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        MyThread3 runnable2 = new MyThread3("Wątek 2");
        Thread thread2 = new Thread(runnable2);
        thread2.start();

        MyThread3 runnable3 = new MyThread3("Wątek 3");
        Thread thread3 = new Thread(runnable3);
        thread3.start();

        do {
            try {
                Thread.sleep(100);
            } catch (InterruptedException exception) {
                System.out.println("Główny wątek został przerwany");
            }
        } while (runnable1.counter != 10 || runnable2.counter != 10 || runnable3.counter != 10);

        System.out.println("Główny wątek został zakończony");
    }
}
