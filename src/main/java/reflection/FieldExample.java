package reflection;

import java.lang.reflect.Field;

public class FieldExample {

    public static String s;
    public int i;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        FieldExample fieldExample = new FieldExample();

        System.out.println(FieldExample.s);
        System.out.println(fieldExample.i);

        Field f;

        f = FieldExample.class.getField("s");
        System.out.println(f.get(null));
        f.set(null, "Ala");
        System.out.println(f.get(null));

        f = fieldExample.getClass().getField("i");
        System.out.println(f.get(fieldExample));
        f.set(fieldExample, 99);
        System.out.println(f.get(fieldExample));
    }
}
