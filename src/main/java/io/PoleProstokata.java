package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PoleProstokata {

    public static void main(String[] args) throws IOException {
        double a, b, pole;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("podaj bok a");
        a = Double.parseDouble(br.readLine());
        System.out.println("podaj bok b");
        b = Double.parseDouble(br.readLine());
        pole = a * b;
        System.out.println("pole = " + pole);

        System.out.printf("pole = %6.2f", pole);
        System.out.printf("pole = %d", (int)pole);
    }
}
