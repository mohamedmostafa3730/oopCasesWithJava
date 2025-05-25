package LibraryManagementSystem;

import java.util.ArrayList;

public class inventory implements I_inventory {
    ArrayList<Book> books = new ArrayList<>();

    @Override
    public void add(String title, String Author, String bookType, int ISBN, int quintiles, boolean Shipping,
            boolean send,
            boolean sale,
            boolean fond) {
        if (!isFond(ISBN)) {
            Book newBook = new Book() {
            };
            newBook.Author = Author;
            newBook.title = title;
            newBook.bookType = bookType;
            newBook.ISBN = ISBN;
            newBook.quintiles = quintiles;
            if (newBook.bookType.equalsIgnoreCase("hardBook")) {
                newBook.Shipping = true;
                newBook.send = false;
            } else if (newBook.bookType.equalsIgnoreCase("showOnly")) {
                newBook.Shipping = false;
                newBook.send = false;
                newBook.sale = false;
                newBook.fond = false;

            } else if (newBook.bookType.equalsIgnoreCase("EBook")) {
                newBook.Shipping = false;
                newBook.send = true;
            } else {
                System.out.println("===================================");
                System.out.println("=== Not fond this Type of Books ===");
                System.out.println("===================================");
            }
            newBook.sale = false;
            newBook.fond = true;
        } else {
            System.out.println("================================");
            System.out.println("=== this Book is fond before ===");
            System.out.println("================================");
        }

    }

    @Override
    public boolean remove(int ISBN) {
        if (search(ISBN) != null) {
            books.remove(search(ISBN));
            System.out.println("==============================================");
            System.out.println("=== this Book " + search(ISBN).bookType + " is removed successfully  ===");
            System.out.println("==============================================");
            return true;
        } else {
            System.out.println("=============================");
            System.out.println("=== this Book is not fond ===");
            System.out.println("=============================");
        }
        return false;
    }

    @Override
    public Book search(int ISBN) {
        for (Book book : books) {
            if (book.ISBN == ISBN) {
                return book;
            }
        }
        return null;
    }

    @Override
    public Book search(Book book) {
        for (Book b : books) {
            if (b == book) {
                return book;
            }
        }
        return null;
    }

    @Override
    public boolean isFond(int ISBN) {
        return search(ISBN) != null;
    }

    @Override
    public boolean updateTitle(Book book, String title) {
        if (search(book) != null) {
            book.title = title;
            return true;
        }
        return false;
    }

    @Override
    public boolean updateAuthor(Book book, String Author) {
        if (search(book) != null) {
            book.Author = Author;
            return true;
        }
        return false;
    }

    @Override
    public boolean updateBookType(Book book, String bookType) {
        if (search(book) != null) {
            book.bookType = bookType;
            return true;
        }
        return false;
    }

    @Override
    public boolean updateISBN(Book book, int ISBN) {
        if (search(book) != null) {
            book.ISBN = ISBN;
            return true;
        }
        return false;
    }

    @Override
    public boolean updateQuintiles(Book book, int quintiles) {
        if (search(book) != null) {
            book.quintiles = quintiles;
            return true;
        }
        return false;
    }

    @Override
    public boolean updateShipping(Book book, boolean Shipping) {
        if (search(book) != null) {
            book.Shipping = Shipping;
            return true;
        }
        return false;
    }

    @Override
    public boolean updateSend(Book book, boolean send) {
        if (search(book) != null) {
            book.send = send;
            return true;
        }
        return false;
    }

    @Override
    public boolean updateSale(Book book, boolean sale) {
        if (search(book) != null) {
            book.sale = sale;
            return true;
        }
        return false;
    }

    @Override
    public boolean updateFond(Book book, boolean fond) {
        if (search(book) != null) {
            book.fond = fond;
            return true;
        }
        return false;
    }

}