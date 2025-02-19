package Book;

import java.util.ArrayList;
import java.util.List;

public class Borrower {
    private String name;
        private List<Book> borrowedBooks;

        public Borrower(String name) {
            this.name = name;
            this.borrowedBooks = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public void borrowBook(Book book) {
            borrowedBooks.add(book);
            System.out.println(name + " borrowed: " + book.getTitle());
        }

        public void returnBook(Book book) {
            borrowedBooks.remove(book);
            System.out.println(name + " returned: " + book.getTitle());
        }

        public void displayBorrowedBooks() {
            System.out.println(name + "'s Borrowed Books:");
            for (Book book : borrowedBooks) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("ISBN: " + book.getIsbn());
                System.out.println("Author: " + book.getAuthor().getName());
                System.out.println("Biography: " + book.getAuthor().getBiography());
                System.out.println("----------------------");
            }
        }
}
