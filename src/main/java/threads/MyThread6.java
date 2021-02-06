package threads;

public class MyThread6 implements Runnable {

    Thread thread;
    volatile boolean zawieszony;
    volatile boolean zatrzymany;

    public MyThread6(String name) {
        thread = new Thread(this, name);
        zawieszony = false;
        zatrzymany = false;

        thread.start();
    }

    @Override
    public void run() {
        System.out.println(thread.getName() + " startuje");

        try {
            for (int i = 1; i < 1000; i++) {
                System.out.print(i + " ");
                if (i%10 == 0) {
                    System.out.println();
                    Thread.sleep(250);

                    synchronized (this) {
                        while (zawieszony) {
                            wait();
                        }

                        if (zatrzymany) {
                            break;
                        }
                    }
                }
            }

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

        System.out.println(thread.getName() + " zakończył działanie");
    }

    synchronized void zatrzymaj() {
        zatrzymany = true;
        zawieszony = false;
        notify();
    }

    synchronized void zawies() {
        zawieszony = true;
    }

    synchronized void wznow() {
        zawieszony = false;
        notify();
    }

    public static void main(String[] args) {

        MyThread6 thread = new MyThread6("Mój wątek");
        try {

            Thread.sleep(1000);

            thread.zawies();
            System.out.println("Zawieszenie wąteku");

            Thread.sleep(1000);

            thread.wznow();
            System.out.println("Wznowienie wątku");

            Thread.sleep(1000);

            thread.zawies();
            System.out.println("Zawieszenie wąteku");

            Thread.sleep(1000);

            thread.wznow();
            System.out.println("Wznowienie wątku");

            Thread.sleep(1000);

            thread.zawies();
            System.out.println("Zawieszenie wąteku");

            Thread.sleep(1000);

            thread.zatrzymaj();
            System.out.println("Zatrzymanie");


        } catch (InterruptedException ex) {
            System.out.println("Wątek został przerwany");
        }
    }
}
