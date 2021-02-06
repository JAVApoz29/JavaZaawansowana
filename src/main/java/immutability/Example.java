package immutability;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Example {

    private BigDecimal bigDecimal;
    private String string;
    Integer integer;

    public static void main(String[] args) {
        BigInteger i = BigInteger.valueOf(20);
        BigInteger j = i.add(BigInteger.valueOf(20));

        System.out.println(i);
        System.out.println(j);
    }
}
