package inner_class;

public class MyClass {

    public void displayMessage(Message message) {
        System.out.println(message.greet() + ", to jest przykład anonimowej klasy przekazanej jako argument");
    }

    public static void main(String[] args) {

        MyClass myClass = new MyClass();
        myClass.displayMessage(new Message() {
            @Override
            public String greet() {
                return "hello";
            }
        });
    }
}
