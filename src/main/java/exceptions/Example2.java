package exceptions;

public class Example2 {

    public static void main(String[] args) {

        try {
            int arr[] = {1, 2, 3, 4, 5};
            System.out.println(arr[7]);
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Podany indeks tablicy nie istnieje");
        }

        System.out.println("tu jest koniec");

    }
}
