package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo12 {
    public static void main(String[] args) {
        Scanner Sc1=new Scanner(System.in);
        System.out.println("Enter Qty");
        int Qty=Sc1.nextInt();
        System.out.println("Enter Price");
        double Price= Sc1.nextDouble();
        getBill(Qty,Price);
    }
    static void getBill(int Qty,double Price){
        if (Price>0){
            double total=Qty*Price;
            System.out.println("Total "+total);
        }else {
            throw new InvalidPriceException("Price Must Be Positive");
        }
    }
}
