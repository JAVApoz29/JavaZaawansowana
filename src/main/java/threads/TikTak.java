package threads;

public class TikTak {

    synchronized void tik(boolean isRunning) {
        if (!isRunning) {
            notify();
            return;
        }

        System.out.print("Tik ");
        notify(); // wybudzamy wątek tak()
        try {
            wait(); // czekamy
        } catch (InterruptedException exception) {
            System.out.println("Wątek został przerwany");
        }
    }

    synchronized void tak(boolean isRunning) {
        if (!isRunning) {
            notify();
            return;
        }

        System.out.println("Tak");
        notify();

        try {
            wait(); // czekamy
        } catch (InterruptedException exception) {
            System.out.println("Wątek został przerwany");
        }
    }

    public static void main(String[] args) {
        TikTak tikTak = new TikTak();

        MyThread thread1 = new MyThread("Tik", tikTak);
        MyThread thread2 = new MyThread("Tak", tikTak);

        try {
            thread1.thread.join();
            thread2.thread.join();
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    static class MyThread implements Runnable {

        Thread thread;
        TikTak tikTak;

        public MyThread(String name, TikTak tikTak) {
            this.thread = new Thread(this, name);
            this.tikTak = tikTak;

            thread.start();
        }

        @Override
        public void run() {
            if (thread.getName().compareTo("Tik") == 0) {
                for (int i = 0; i < 5; i++) {
                    tikTak.tik(true);
                }
                tikTak.tik(false);
            } else {
                for (int i = 0; i < 5; i++) {
                    tikTak.tak(true);
                }
                tikTak.tak(false);
            }
        }
    }
}
