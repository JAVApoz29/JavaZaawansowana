package collections.lists;

public class MyLinkedList<T> {

    private MyLinkedListItem<T> head;

    public void add(T element) {

        // [ ] -> [ ] -> [ ] -> null
        if (head == null) {
            head = new MyLinkedListItem<>(element);
        } else {
            MyLinkedListItem tmp = head;
            while (tmp.getNext() != null) {
                tmp = tmp.getNext();
            }

            tmp.setNext(new MyLinkedListItem(element));
        }
    }
}
