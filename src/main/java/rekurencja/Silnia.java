package rekurencja;

public class Silnia {

    // n! = n * (n - 1)!
    // 0! = 1

    public static int policz(int liczba) {
        if (liczba == 0) {
            return 1;
        }
        return liczba * policz(liczba - 1);
    }

    public static void main(String[] args) {
        System.out.println(policz(2));
        System.out.println(policz(3));
        System.out.println(policz(4));
        System.out.println(policz(5));
    }
}
