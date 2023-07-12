package Interface;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select Flight Service Provider");
        System.out.println("1:AirIndia\t2:Indigo");
        String Service=sc.next();
        System.out.println("Enter Qty");
        FlightServiceProvider provider;//reference of interface
        int qty=sc.nextInt();
        int choice=sc.nextInt();
        if (choice==1){
            provider=new AirIndia();//upcasting
            provider.getServiceName(Service);
            provider.BookTicket(qty);
        } else if (choice==2) {
            provider=new Indigo();//upcasting
            provider.getServiceName(Service);
            provider.BookTicket(qty);
        }else {
            System.out.println("Please Select ticket");
    }
    }
}
