package io;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

// program, który zapisuje do pliku macierz 10 x 10
// 1 0 0 0 0 0 0 0 0 0
// 0 1 0 0 0 0 0 0 0 0
// 0 0 1 0 0 0 0 0 0 0
// 0 0 0 1 0 0 0 0 0 0
// ...
public class Macierz {

    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = null;
        fileWriter = new FileWriter("macierz.txt");

        int[][] macierz = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    macierz[i][j] = 1;
                } else {
                    macierz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                fileWriter.write(macierz[i][j] + " ");
            }
            fileWriter.write("\n");
        }
        fileWriter.close();
    }
}
