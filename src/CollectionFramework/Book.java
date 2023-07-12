package CollectionFramework;

public class Book {
    private  int BookId;
    private String BookName;
    private double BookPrice;

    public Book(int bookId, String bookName, double bookPrice) {
        BookId = bookId;
        BookName = bookName;
        BookPrice = bookPrice;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public double getBookPrice() {
        return BookPrice;
    }

    public void setBookPrice(double bookPrice) {
        BookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return BookId+"\t"+BookName+"\t"+BookPrice;
    }
}
