package org.example.iterator;

public class BookIterator implements Iterator<Book> {
    private Book[] books;
    private int position = 0;

    public BookIterator(Book[] books) {
        this.books = books;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        if(books == null){
            return false;
        }

        if(position < books.length){
            return true;
        }
        return false;
    }

    @Override
    public Book next() {
        Book book = books[position];
        position += 1;
        return book;
    }
}
