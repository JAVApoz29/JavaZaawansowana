package stack;

public class Stack {

    private int size;
    private Object[] elements;
    private int length = 0;

    public Stack(int size) {
        this.size = size;
        this.elements = new Object[10];
    }

    public void push(Object element) throws StackIsFullException {
        // TODO: umieść element na stosie
        // TODO: zrzuć wyjątek StackIsFullException gdy stos jest pełen
        if (length >= size) {
            throw new StackIsFullException();
        }

        elements[length] = element;
        length++;
    }

    public Object peek() throws StackIsEmptyException {
        // TODO: zwracamy element ze szczytu stosu
        if (length == 0) {
            throw new StackIsEmptyException();
        }

        return elements[length - 1];
    }

    public Object pop() throws StackIsEmptyException {
        // TODO: zwracamy element ze szczytu stosu i usuwamy go ze stosu
        if (length == 0) {
            throw new StackIsEmptyException();
        }

        length--;
        return elements[length];
    }

    public int getLength() {
        return length;
    }
}
