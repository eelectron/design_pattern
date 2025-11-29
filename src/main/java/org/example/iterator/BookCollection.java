package org.example.iterator;


public class BookCollection implements Collection<Book>{
    private Book[] books;
    private int index;

    public BookCollection(int size) {
        books = new Book[size];
        index = 0;
    }
    public void addBook(Book book) {
        if (index < books.length) {
            books[index++] = book;
        }
    }


    @Override
    public Iterator<Book> iterator() {
        return new BookIterator(books);
    }
}
