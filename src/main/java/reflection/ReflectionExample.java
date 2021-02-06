package reflection;

import java.time.DayOfWeek;

public class ReflectionExample {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class c;

        c = "foo".getClass();
        System.out.println(c.getName());

        c = System.out.getClass();
        System.out.println(c.getName());

        c = DayOfWeek.SATURDAY.getClass();
        System.out.println(c.getName());

        byte[] bytes = new byte[1024];
        c = bytes.getClass();
        System.out.println(c.getName());

        String[] strings = new String[1024];
        c = strings.getClass();
        System.out.println(c.getName());

        c = java.io.PrintStream.class;
        System.out.println(c.getName());

        c = int[][][].class;
        System.out.println(c.getName());

        c = boolean.class;
        System.out.println(c.getName());

//        boolean b = true;
//        c = b.getClass();

        c = Class.forName("stack.Stack");
        System.out.println(c.getName());

        c = Class.forName("[D");
        System.out.println(c.getName());

//        c = Class.forName("");
//        System.out.println(c.getName());

        class C1 {}
        class C2 extends C1 {}

        C1 c1 = new C1();
        // c1 = C1.class.newInstance();
        C2 c2 = new C2();

        boolean b1 = c1.getClass().isAssignableFrom(c2.getClass());
        System.out.println(b1);

        boolean b2 = c2.getClass().isAssignableFrom(c1.getClass());
        System.out.println(b2);

        boolean b3 = c1.getClass().isInstance(c2);
        System.out.println(b3);

        boolean b4 = c2.getClass().isInstance(c1);
        System.out.println(b4);
    }
}
