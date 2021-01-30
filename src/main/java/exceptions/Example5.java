package exceptions;

public class Example5 {

    public static void main(String[] args) {

        try {
            int a[] = new int[7];
            // int b = 30 / 0;
            int b = 30 / 0;
            a[0] = b;
        } finally {
            System.out.println("czyszczę dane - jestem w finally");
        }

        System.out.println("tu jest koniec");
    }
}
