package io;

import java.io.*;

public class ImieNazwiskoProgram {

    private String imieNazwisko;

    public void czytajDane() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        imieNazwisko = br.readLine();
    }

    public void zapiszDoPliku() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("imienazwisko.txt");
            fileWriter.write(imieNazwisko);
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
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("imienazwisko.txt");
            BufferedReader br = new BufferedReader(fileReader);

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
        ImieNazwiskoProgram program = new ImieNazwiskoProgram();
        program.czytajDane();
        program.zapiszDoPliku();
        program.czytajPlik();
    }
}
