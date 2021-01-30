package exceptions;

public class Example3 {

    public static void main(String[] args) {

        try {
            int num1 = 10;
            int num2 = 0;

            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("dzielenie przez 0");
        }

    }
}
