/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan6;
import java.util.*;

public class main {
    
    public class Author{
        private String name;
        private String biography;

        public Author(String name, String biography) {
            this.name = name;
            this.biography = biography;
        }

        public String getName() {
            return name;
        }

        public String getBiography(){
            return biography;
        }
    }
    
    public class Book {
        private String title;
        private String isbn;
        private Author author;

        public Book(String title, String isbn, Author author) {
            this.title = title;
            this.isbn = isbn;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getIsbn() {
            return isbn;
        }

        public Author getAuthor() {
            return author;
        }
    }

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
    
    public main(){
	Author author1 = new Author("James Gosling", "Creator of the Java programming language.");
        Author author2 = new Author("Robert C. Martin", "Known for his works on software craftsmanship.");

        Book book1 = new Book("Java Programming", "123456789", author1);
        Book book2 = new Book("Clean Code", "987654321", author2);

        Library library = new Library();

        library.addBook(book1);
        library.addBook(book2);

        Borrower borrower = new Borrower("Alice");

        library.borrowBook(borrower, book1);
        library.borrowBook(borrower, book2);

        borrower.displayBorrowedBooks();

        library.returnBook(borrower, book1);

        borrower.displayBorrowedBooks();
        
        library.displayLibraryBooks();
    }
    public static void main(String[] args) {
        new main();
    }
    
}
