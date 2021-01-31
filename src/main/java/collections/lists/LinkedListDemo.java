package collections.lists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Ala");
        linkedList.add("ma");
        linkedList.add("kota");

        System.out.println(linkedList);

        linkedList.add(2, "czarnego");

        System.out.println(linkedList);

        ArrayList<String> tmpList = new ArrayList<>();
        tmpList.add("kot");
        tmpList.add("ma");
        tmpList.add("Alę");

        linkedList.addAll(tmpList);
        linkedList.addAll(7, tmpList);

        System.out.println(linkedList);

        linkedList.addFirst("START");
        linkedList.addLast("END");

        System.out.println(linkedList);

        System.out.println("Czy kot istnieje? " + linkedList.contains("kot"));
        System.out.println("Czy pies istnieje? " + linkedList.contains("pies"));

        System.out.println("Element w indeksie 3 = " + linkedList.get(3));
        System.out.println("Pierwszy element = " + linkedList.getFirst());
        System.out.println("Ostatni element = " + linkedList.getLast());
        System.out.println("Index of ma " + linkedList.indexOf("ma"));
        System.out.println("Index of ma " + linkedList.lastIndexOf("ma"));
        System.out.println("poll = " + linkedList.poll());
        System.out.println(linkedList);

        System.out.println("poll first = " + linkedList.pollFirst());
        System.out.println(linkedList);

        System.out.println("poll last = " + linkedList.pollLast());
        System.out.println(linkedList);

        LinkedList<String> copyList = linkedList;
        LinkedList<String> cloneList = (LinkedList<String>)linkedList.clone();

        linkedList.remove(); // usuwa pierwszy element
        linkedList.remove(2); // usuwa element o podanym indeksie
        linkedList.removeFirst(); // usuwa pierwszy element
        linkedList.removeLast(); // usuwa ostatni element
        linkedList.removeFirstOccurrence("ma");
        linkedList.removeLastOccurrence("ma");

        System.out.println(linkedList);

        linkedList.set(1, "SET na indeksie nr 1");

        System.out.println(linkedList);

        System.out.println("COPY " + copyList);
        System.out.println("CLONE " + cloneList);

        linkedList.add("END_2");

        System.out.println("COPY " + copyList);
        System.out.println("CLONE " + cloneList);

        linkedList.clear();

        System.out.println(linkedList);
    }
}
