package threads;

public class MyThread1 extends Thread {

    @Override
    public void run() {
        System.out.println("Mój pierwszy wątek");
    }

    public static void main(String[] args) {
        Thread thread = new MyThread1();
        thread.start();
    }
}
