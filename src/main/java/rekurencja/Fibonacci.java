package rekurencja;

public class Fibonacci {

    // ciąg fibonacciego Fn = F(n-1) + F(n-2), F(1) = 1, F(0) = 0

    public static int policz(int liczba) {
        if (liczba == 0) {
            return 0;
        }

        if (liczba == 1) {
            return 1;
        }

        return policz(liczba - 1) + policz(liczba - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(policz(i));
        }
    }
}
