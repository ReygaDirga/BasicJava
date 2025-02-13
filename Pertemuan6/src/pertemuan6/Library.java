package pertemuan6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dwiok
 */
public class Library {
    private List<Book> books;

        public Library() {
            this.books = new ArrayList<>();
        }

        public void addBook(Book book) {
            books.add(book);
            System.out.println("Book added to library: " + book.getTitle());
        }

        public void borrowBook(Borrower borrower, Book book) {
            if (books.contains(book)) {
                books.remove(book);
                borrower.borrowBook(book);
            }
        }

        public void returnBook(Borrower borrower, Book book) {
            books.add(book);
            borrower.returnBook(book);
        }

        public void displayLibraryBooks() {
            System.out.println("Books in Library:");
            for (Book book : books) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println("Author: " + book.getAuthor().getName());
                System.out.println("Biography: " + book.getAuthor().getBiography());
                System.out.println("----------------------");
            }
        }
}
