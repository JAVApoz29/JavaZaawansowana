package threads;

import java.util.Vector;

public class Synchronized1 {

    private int sum;

    synchronized public int sumArray(int numers[]) {

        sum = 0;
        for (int i = 0; i < numers.length; i++) {
            sum += numers[i];
            System.out.println("Bieżąca wartość sumy dla " + Thread.currentThread().getName() + " wynosi " + sum);
            try {
                Thread.sleep(10);
            } catch (InterruptedException exception) {
                System.out.println("Główny wątek został przerwany");
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        MyThread thread1 = new MyThread("Wątek 1", a);
        MyThread thread2 = new MyThread("Wątek 2", a);
    }

    static class MyThread implements Runnable {

        private Thread thread;
        static Synchronized1 sumArray = new Synchronized1();
        int a[];
        int result;
        Vector vector;

        public MyThread(String name, int numbers[]) {
            thread = new Thread(this, name);
            thread.start();
            a = numbers;
        }

        @Override
        public void run() {
            System.out.println(thread.getName() + " startuje");
            result = sumArray.sumArray(a);
            System.out.println("Suma dla " + thread.getName() + " = " + result);
            System.out.println(thread.getName() + " został zakończony");
        }
    }
}
