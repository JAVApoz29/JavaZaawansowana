package stack;

public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack(10);
        try {
            stack.push("Ala");
            stack.push("ma");
            stack.push("kota");
        } catch (StackIsFullException e) {
            e.printStackTrace();
        }
    }
}
