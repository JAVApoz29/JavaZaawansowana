package threads;

public class MyThread4 implements Runnable {

    private int counter;
    private Thread thread;

    public MyThread4(String stringThread) {
        this.counter = 0;
        thread = new Thread(this, stringThread);
        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " startuje");

        do {
            try {
                Thread.sleep(500);
                System.out.println(thread.getName() + ", couunter = " + counter);
                counter++;
            } catch (InterruptedException exception) {
                System.out.println(thread.getName() + " został przerwany");
            }
        } while (counter <= 10);

        System.out.println(thread.getName() + " zakończony");
    }

    public static void main(String[] args) {
        System.out.println("Główny wątek startuje");

        MyThread4 thread1 = new MyThread4("Wątek 1");
        MyThread4 thread2 = new MyThread4("Wątek 2");
        MyThread4 thread3 = new MyThread4("Wątek 3");

        try {
            thread1.thread.join();
            System.out.println(thread1.thread.getName() + " dołączył");

            thread2.thread.join();
            System.out.println(thread2.thread.getName() + " dołączył");

            thread3.thread.join();
            System.out.println(thread3.thread.getName() + " dołączył");

            if (thread1.thread.isAlive()) {
                System.out.println(thread1.thread.getName() + " is alive");
            }

        } catch (InterruptedException exception) {
            System.out.println("Główny wątek został przerwany");
        }

        System.out.println("Główny wątek został zakończony");
    }
}
