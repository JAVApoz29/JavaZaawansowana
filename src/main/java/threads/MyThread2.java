package threads;

public class MyThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Mój drugi wątek");
    }

    public static void main(String[] args) {
        Runnable runnable = new MyThread2();
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
