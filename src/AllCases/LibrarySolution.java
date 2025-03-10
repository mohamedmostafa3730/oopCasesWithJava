
import java.util.ArrayList;

public class LibrarySolution {
    public static void main(String[] args) {
        Library l = new Library();
        
        book book1 = new book("mo", 4);
        book book2 = new book("om", 5);
        book book3 = new book("kd", 6);

        l.addBook(book1);
        l.addBook(book2);
        l.addBook(book3);
        l.print();
        System.out.println("===========");
        l.removeBook(book3);
        l.print();
    }

    public static class Library {
        public Library(){
        }
        ArrayList<book> collectionOfBooks = new ArrayList<>();

        int booksCounts = 0;

        public void addBook(book b) {
            collectionOfBooks.add(b);
            this.booksCounts++;
        }

        public void removeBook(book b) {
            collectionOfBooks.remove(b);
            this.booksCounts--;
        }

        public ArrayList<book> getCollectionOfBooks() {
            return collectionOfBooks;
        }

        public void setCollectionOfBooks(ArrayList<book> collectionOfBooks) {
            this.collectionOfBooks = collectionOfBooks;
        }

        public void print() {
            System.out.println("All information of Library");
            System.out.println("==========================");
            System.out.println("the books count => " + this.booksCounts);
            System.out.println("--------------------");
            for (book b : collectionOfBooks) {
                System.out.println("book name => " + b.name);
                System.out.println("book number => " + b.number);
                System.out.println("________________");
            }

        }

        public int getBooksCounts() {
            return booksCounts;
        }

        public void setBooksCounts(int booksCounts) {
            this.booksCounts = booksCounts;
        }
    }

    public static class book {
        String name;
        int number;

        public book(String name, int number) {
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }

}
