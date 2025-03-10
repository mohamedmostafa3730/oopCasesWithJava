

import java.util.ArrayList;

public class BookSolution {
    public static void main(String[] args) {
        Book bookOne = new Book("The Home", "Ahmed", 1);
        Book bookTWo = new Book("Why sleep?", "mostafa", 2);
        Book bookThree = new Book("The one Thing", "mohamed", 3);
        Book.addBook(bookOne);
        Book.addBook(bookTWo);
        Book.addBook(bookThree);
        ArrayList<Book> bookCollection = Book.getCollection();
        for (Book book : bookCollection) {
            System.out.println("======================================");
            System.out.println("Title of Book => " + book.getTitle());
            System.out.println("-----------------------------");
            System.out.println("Author of Book => " + book.getAuthor());
            System.out.println("-----------------------------");
            System.out.println("ISBN of Book => " + book.getISBN());
            System.out.println("======================================");
        }

    }

    /*
     * [1] Write a Java program to create a class called "Book" (Done)
     * [2] with attributes for title, author, and ISBN, (Done)
     * [3] and methods to add and remove books from a collection. ()
     */

    public static class Book {
        private String title, author;
        private int ISBN;
        private static ArrayList<Book> bookCollection = new ArrayList<Book>();

        public Book(String title, String author, int ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public int getISBN() {
            return ISBN;
        }

        public void setISBN(int ISBN) {
            this.ISBN = ISBN;
        }

        public static void addBook(Book book) {
            bookCollection.add(book);
        }

        public static void removeBook(Book book) {
            bookCollection.remove(book);
        }

        public static ArrayList<Book> getCollection() {
            return bookCollection;
        }

    }
}
