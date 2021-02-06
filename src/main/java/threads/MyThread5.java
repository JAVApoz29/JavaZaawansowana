package threads;

public class MyThread5 implements Runnable {

    private int counter;
    private Thread thread;

    private static boolean stop = false;
    private static String threadName;

    public MyThread5(String threadName) {
        this.counter = 0;
        this.threadName = threadName;

        thread = new Thread(this, threadName);
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " startuje");
        do {
            counter++;

            if (threadName != thread.getName()) {
                threadName = thread.getName();
                System.out.println(threadName);
            }
        } while (stop == false && counter <= 1000);

        stop = true;
        System.out.println(thread.getName() + " zakończony");
    }

    public static void main(String[] args) {
        System.out.println("Główny wątek startuje");

        MyThread5 thread1 = new MyThread5("Wysoki priorytet");
        thread1.thread.setPriority(Thread.NORM_PRIORITY - 2);

        MyThread5 thread2 = new MyThread5("Niski priorytet");
        thread2.thread.setPriority(Thread.NORM_PRIORITY + 2);

        thread1.thread.start();
        thread2.thread.start();

        try {
            thread1.thread.join();
            System.out.println("Wątek o wysokim priorytecie dołączył");
            thread2.thread.join();
            System.out.println("Wątek o niskim priorytecie dołączył");
        } catch (InterruptedException exception) {
            System.out.println("Główny wątek został przerwany");
        }

        System.out.println("Wysoki priorytet: stan licznika: " + thread1.counter);
        System.out.println("Niski priorytet: stan licznika: " + thread2.counter);
    }
}
