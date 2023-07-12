package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class BookService {
    //create list to Store Book
    ArrayList<Book> bookList=new ArrayList<>();
    //Add Book
    public void addBook(int id, String name, double price) {
        Book b1=new Book(id,name,price);
        bookList.add(b1);
        System.out.println("Book Add Successfully");
    }
    //Delete Book
    public void deleteBook(int bId) {
        Iterator<Book> itr=bookList.iterator();
        while (itr.hasNext()){
            Book b=itr.next();
            if (b.getBookId()==bId){
                itr.remove();
                System.out.println("Book Removed Successfully");
            }
        }
    }
    //Display Book
    public void displayBook() {
        System.out.println("ID\tNAME\tPRICE");
        System.out.println("===============================");
        for (Book b:bookList){
            System.out.println(b);
        }
    }

}
