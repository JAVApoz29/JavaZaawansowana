package io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {

    // B B B B B B B B
    public static void main(String[] args) throws IOException {

        double tablica[] = { 10.1, 3.5, 89.7, 60.28, 100.12, 0.01 };
        RandomAccessFile raf = new RandomAccessFile("data.dat", "rw");
        for (double d : tablica) {
            raf.writeDouble(d);
        }
        raf.close();

        RandomAccessFile raf2 = new RandomAccessFile("data.dat", "r");
        for (int i = 0; i < tablica.length; i += 2) {
            raf2.seek(8 * i);
            double d = raf2.readDouble();
            System.out.println(d);
        }
        raf2.close();
    }
}
