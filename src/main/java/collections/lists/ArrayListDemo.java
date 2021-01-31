package collections.lists;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList<String> stringArrayList = new ArrayList<>();
        String[] tab = new String[3];
        tab[0] = "Ala";
        tab[1] = "ma";
        tab[2] = "kota";

        // dodawanie elementów do listy
        stringArrayList.add("Ala"); //index 0
        stringArrayList.add("ma"); // index 1
        stringArrayList.add("kota"); // index 2

        // foreach
        for (String str : stringArrayList) {
            System.out.println(str);
        }

        System.out.println(stringArrayList);
        System.out.println(stringArrayList.get(2));

        stringArrayList.add(2, "czarnego");

        System.out.println(stringArrayList);

        // usuwanie elementów z listy
        stringArrayList.remove(2);
        System.out.println(stringArrayList);

        stringArrayList.add("kota");
        System.out.println(stringArrayList);
        stringArrayList.remove("kota"); // usuwa pierwsze wystąpienie obiektu "kota"
        System.out.println(stringArrayList);

        // aktualizuowanie elementów listy
        stringArrayList.set(2, "psa");
        System.out.println(stringArrayList);

        // wyszukiwanie
        // gdzie jest obiekt
        System.out.println("Index psa = " + stringArrayList.indexOf("psa"));
        System.out.println("Indeks kota = " + stringArrayList.indexOf("kota"));

        // czy obiekt występuje
        System.out.println("Czy występuje pies? " + stringArrayList.contains("psa"));
        System.out.println("Czy występuje kot? " + stringArrayList.contains("kota"));

        // pobieranie
        System.out.println(stringArrayList.get(0));

        // ilość elementów listy
        System.out.println(stringArrayList.size());

        // czyszczenie
        stringArrayList.clear();
        System.out.println(stringArrayList);
    }
}
