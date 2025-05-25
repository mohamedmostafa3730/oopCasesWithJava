package LibraryManagementSystem;

public abstract class Book {
    String title;
    String Author;
    int ISBN;
    int quintiles;
    boolean Shipping;
    boolean send;
    boolean sale;
    boolean fond;
    String bookType;

    public Book(String title, String Author, String bookType, int ISBN, int quintiles, boolean Shipping, boolean send,
            boolean sale, boolean fond) {
        this.title = title;
        this.Author = Author;
        this.ISBN = ISBN;
        this.quintiles = quintiles;
        this.Shipping = Shipping;
        this.send = send;
        this.sale = sale;
        this.fond = fond;
        this.bookType = bookType;
    }

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getQuintiles() {
        return quintiles;
    }

    public void setQuintiles(int quintiles) {
        this.quintiles = quintiles;
    }

    public boolean isShipping() {
        return Shipping;
    }

    public void setShipping(boolean Shipping) {
        this.Shipping = Shipping;
    }

    public boolean isSend() {
        return send;
    }

    public void setSend(boolean send) {
        this.send = send;
    }

    public boolean isSale() {
        return sale;
    }

    public void setSale(boolean sale) {
        this.sale = sale;
    }

    public boolean isFond() {
        return fond;
    }

    public void setFond(boolean fond) {
        this.fond = fond;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

}
