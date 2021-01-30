package inner_class;

public class AnonymousClass {

    private interface GreetingModule2 {
        void sayHello();
    }

    public static void main(String[] args) {

        GreetingModule2 greetingModule = new GreetingModule2() {
            @Override
            public void sayHello() {
                System.out.println("good morning");
            }
        };
    }
}
