package stack;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayStack<T> {

    private int size;
    private LinkedList<T> elements;

    public ArrayStack() {
        this(0);
    }

    public ArrayStack(int size) {
        this.size = size;
        this.elements = new LinkedList<T>();
    }

    public void push(T element) throws StackIsFullException {
        // TODO: umieść element na stosie
        // TODO: zrzuć wyjątek StackIsFullException gdy stos jest pełen
        if (size > 0 && elements.size() >= size) {
            throw new StackIsFullException();
        }

        elements.add(element);
    }

    public Object peek() throws StackIsEmptyException {
        // TODO: zwracamy element ze szczytu stosu
        if (elements.size() == 0) {
            throw new StackIsEmptyException();
        }

        return elements.getLast();
    }

    public Object pop() throws StackIsEmptyException {
        // TODO: zwracamy element ze szczytu stosu i usuwamy go ze stosu
        if (elements.size() == 0) {
            throw new StackIsEmptyException();
        }

        return elements.pollLast();
    }

    public int getLength() {
        return elements.size();
    }
}
