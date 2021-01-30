package exceptions;

public class Example4 {

    public static void main(String[] args) {

        try {
            int a[] = new int[7];
            // int b = 30 / 0;
            int b = 30 / 10;
            a[0] = b;
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Przekroczono rozmiar tablicy");
        } catch (ArithmeticException ex) {
            System.out.println("Dzielenie przez 0");
        } catch (Exception ex) {
            System.out.println("Poszło coś nie tak");
        } finally {
            System.out.println("czyszczę dane - jestem w finally");
            try {
                int k = 30 / 0;
            } catch (Exception ex) {
                System.out.println("Dzielenie przez 0 w finally");
            }

        }
    }
}
