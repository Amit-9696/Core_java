package CollectionFramework;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ShoppingCart s=new ShoppingCart();
        boolean Status=true;
        while (Status){
            System.out.println("Select Mode Of Operation");
            System.out.println("1:Show All Product");
            System.out.println("2:Add To Cart");
            System.out.println("3:View Cart Items");
            System.out.println("4:Remove Cart Items");
            System.out.println("5:Exit");
            int choice= sc.nextInt();
            switch (choice){
                case 1:
                    s.ShowProduct();
                    break;
                case 2:
                    System.out.println("Enter Product Name");
                    String Name= sc.next();
                    s.addToCart(Name);
                    break;
                case 3:
                    s.ViewCart();
                    break;
                case 4:
                    System.out.println("Enter Item Name");
                    String item= sc.next();
                    s.removeCart(item);
                    break;
                default:
                    Status=false;
            }
        }
    }
}
