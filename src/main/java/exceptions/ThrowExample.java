package exceptions;

public class ThrowExample {

    static void check(int age, int weight) {
        if (age < 12 && weight < 40) {
            throw new CheckAgeAndWeightException("incorrect data");
        } else {
            System.out.println("OK");
        }
    }

    public static void main(String[] args) {

        System.out.println("Start");
        check(10, 39);
        System.out.println("End");
    }
}
