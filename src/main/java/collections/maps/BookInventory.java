package collections.maps;

import java.util.HashMap;

public class BookInventory {

    private HashMap<String, Book> books = new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
    }

    public void removeBook(String isbn) {
        books.remove(isbn);
    }

    public Book getBook(String isbn) {
        return books.get(isbn);
    }

    public static void main(String[] args) {

        BookInventory bookInventory = new BookInventory();
        bookInventory.addBook(new Book("Java zaawansowana", "Jan kowalski", 2021, "123456789"));
        bookInventory.addBook(new Book("Java od kuchni", "Piotr Nowak", 2011, "3453382738"));
        bookInventory.addBook(new Book("Java zaawansowana 2", "Jan kowalski", 2021, "123456789"));
    }
}
