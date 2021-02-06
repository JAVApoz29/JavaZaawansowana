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

    public static int policz2(int liczba) {
        return liczba == 1 ? 1 : liczba * policz2(liczba - 1);
    }

    public static int policzDla1() {
        return 1;
    }

    public static int policzDla2() {
        return 2 * policzDla1();
    }

    public static int policzDla3() {
        return 3 * policzDla2();
    }

    public static void main(String[] args) {
        System.out.println(policz(2));
        System.out.println(policz(3));
        System.out.println(policz(4));
        System.out.println(policz(5));

        System.out.println(policzDla3());


    }
}
