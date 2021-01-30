package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {

    public static void main(String[] args) {

        try {

            FileInputStream fileInputStream = null;

            fileInputStream = new FileInputStream("/jakas/sciezka/do/pliku");

            int k;
            while ((k = fileInputStream.read()) != -1) {

            }

            fileInputStream.close();

        } catch (Exception e) {

            System.out.println("Wystąpił błąd podczas otwierania pliku");

        }

        System.out.println("tu jest koniec");

    }
}


