package inner_class;

public class OuterClass2 {

    public static class InnerClass2 {

    }

    public OuterClass2.InnerClass2 instantiate() {
        return new OuterClass2.InnerClass2();
    }
}
