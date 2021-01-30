package inner_class;

public class Main {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        OuterClass.InnerClass innerClass1 = outerClass.instantiate();

        OuterClass2 outerClass2 = new OuterClass2();
        OuterClass2.InnerClass2 innerClass2 = new OuterClass2.InnerClass2();
        OuterClass2.InnerClass2 innerClass12 = outerClass2.instantiate();

        class LocalClass {
            private String name;

            public LocalClass(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "LocalClass{" +
                        "name='" + name + '\'' +
                        '}';
            }
        }

        LocalClass localClass = new LocalClass("klasa lokalna");
        System.out.println(localClass);


        GreetingModule greetingModule = new GreetingModule() {
            private int a;

            @Override
            public void sayHello() {
                System.out.println("good morning");
            }
        };

        greetingModule.sayHello();
    }
}
