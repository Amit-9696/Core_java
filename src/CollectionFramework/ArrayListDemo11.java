package CollectionFramework;

import java.util.Scanner;

public class ArrayListDemo11 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        BookService service=new BookService();
        boolean Status=true;
        while (Status){
            System.out.println("Select Mode Of Operation");
            System.out.println("1:Add New Book");
            System.out.println("2:Delete Existing Book");
            System.out.println("3:Display All Book");
            System.out.println("4:Exit");
            int choice=sc1.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Book ID");
                    int Id= sc1.nextInt();
                    System.out.println("Enter Book Name");
                    String Name= sc1.next();
                    System.out.println("Enter Book Price");
                    double Price=sc1.nextDouble();
                    service.addBook(Id,Name,Price);
                    break;
                case 2:
                    System.out.println("Enter Book ID");
                    int bId=sc1.nextInt();
                    service.deleteBook(bId);
                    break;
                case 3:
                    service.displayBook();
                    break;
                default:
                    Status=false;
            }
        }
    }
}
