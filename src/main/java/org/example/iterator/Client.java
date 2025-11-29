package org.example.iterator;

public class Client {
    static void main() {
        Book[] books = {
            new Book("1984", "George Orwell"),
            new Book("To Kill a Mockingbird", "Harper Lee"),
            new Book("The Great Gatsby", "F. Scott Fitzgerald")
        };

        BookCollection bookCollection = new BookCollection(books.length);
        for (Book book : books) {
            bookCollection.addBook(book);
        }

        Iterator<Book> iterator = bookCollection.iterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }
    }
}
