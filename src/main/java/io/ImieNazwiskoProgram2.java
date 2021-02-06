package io;

import java.io.*;

public class ImieNazwiskoProgram2 {
    private String imieNazwisko;

    public void czytajDane() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        imieNazwisko = br.readLine();
    }

    public void zapiszDoPliku() {
        FileOutputStream fileWriter = null;
        try {
            fileWriter = new FileOutputStream("imienazwisko.txt");
            fileWriter.write(imieNazwisko.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void czytajPlik() {
        FileInputStream fileReader = null;
        try {
            fileReader = new FileInputStream("imienazwisko.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fileReader));

            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ImieNazwiskoProgram2 program = new ImieNazwiskoProgram2();
        program.czytajDane();
        program.zapiszDoPliku();
        program.czytajPlik();
    }
}
