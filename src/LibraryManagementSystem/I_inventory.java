package LibraryManagementSystem;

public interface I_inventory {
    public void add(String title, String Author, String bookType, int ISBN, int quintiles, boolean Shipping,
            boolean send,
            boolean sale,
            boolean fond);

    public boolean remove(int ISBN);

    public boolean updateTitle(Book book, String title);

    public boolean updateAuthor(Book book, String Author);

    public boolean updateBookType(Book book, String bookType);

    public boolean updateISBN(Book book, int ISBN);

    public boolean updateQuintiles(Book book, int quintiles);

    public boolean updateShipping(Book book, boolean Shipping);

    public boolean updateSend(Book book, boolean send);

    public boolean updateSale(Book book, boolean sale);

    public boolean updateFond(Book book, boolean fond);

    public Book search(int ISBN);

    public Book search(Book book);

    public boolean isFond(int ISBN);
}
