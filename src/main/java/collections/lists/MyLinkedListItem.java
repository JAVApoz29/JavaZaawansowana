package collections.lists;

public class MyLinkedListItem<T> {

    private T data;
    private MyLinkedListItem<T> next;

    public MyLinkedListItem(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public MyLinkedListItem<T> getNext() {
        return next;
    }

    public void setNext(MyLinkedListItem<T> next) {
        this.next = next;
    }
}
