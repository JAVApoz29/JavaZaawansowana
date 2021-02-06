package rekurencja;

public class BinarySearch {

    public static int search(int[] tab, int startIndex, int endIndex, int searchNumber) {

        if (startIndex > endIndex) {
            return -1;
        }

        int srodek = (endIndex + startIndex) / 2;
        if (tab[srodek] == searchNumber) {
            return srodek;
        } else {
            if (tab[srodek] > searchNumber) {
                endIndex = srodek - 1;
            } else {
                startIndex = srodek + 1;
            }
        }

        return search(tab, startIndex, endIndex, searchNumber);
    }

    public static void main(String[] args) {
        // 4
        // [ 1, 4, 5, 6, 8, 9, 10, 12, 18, 19 ]
        // 9 == 4 ? NIE
        // jeżeli 9 > 4 to weź to co jest po lewej stronie od 9
        // [ 1, 4, 5, 6, 8 ]
        // 5 == 4 ? NIE
        // jeżeli 5 > 4 to weź to co jest po lewej stronie od 9
        // [ 1, 4 ]
        // 4 == 4 ? TAK
        // zwracamy ineex = 1

        int[] tab = { 1, 4, 5, 6, 8, 9, 10, 12, 18, 19 };
        System.out.println(search(tab, 0, tab.length - 1, 4));
        System.out.println(search(tab, 0, tab.length - 1, 11));
        System.out.println(search(tab, 0, tab.length - 1, 12));
    }
}
