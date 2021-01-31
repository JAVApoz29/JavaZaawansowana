package rekurencja;

public class SumaLiczb {

    // 10k = 10 + 9k
    // 9k = 9 + 8k
    // ..
    // 1k = 1 + 0
    // fun(10) = 10 + fun(9)
    // f(x) = x + f(x-1)
    // f(1) = 1

    // silnia n! = n * (n - 1)!, 0! = 1
    // *potęga 2^n = 2 * 2^(n-1), 2^0 = 1
    // ciąg fibonacciego Fn = F(n-1) + F(n-2), F(1) = 1, F(0) = 0
    // zadanie domowe: wyszukiwanie binarne (rekurencyjnie)

    public static int policz(int liczba) {
        if (liczba == 1) {
            return 1;
        }

        return liczba + policz(liczba - 1);
    }

    public static int policz2(int liczba) {

        int suma = 0;
        for (int i = 1; i <= liczba; i++) {
            suma += i;
        }

        return suma;
    }

    public static int policz3(int liczba) {

        int suma = 0;
        while (liczba >= 1) {
            suma += liczba;
            liczba--;
        }

        return suma;
    }

    public static void main(String[] args) {
        System.out.println(policz(10));
        System.out.println(policz3(10));
    }
}
