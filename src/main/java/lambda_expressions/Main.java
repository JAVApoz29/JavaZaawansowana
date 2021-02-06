package lambda_expressions;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        MyInterface myInterface = (String text) -> {
            System.out.println(text);
        };
    }
}
