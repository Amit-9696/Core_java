package Overloading;

import java.util.Scanner;

public class MainApp3 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Transaction t1 = new Transaction();
        System.out.println("ENTER AMT");
        double Amt = sc1.nextDouble();
        System.out.println("SELECT PAYMENT MODE");
        System.out.println("1:CARD");
        System.out.println("2:UPI");
        int Choice = sc1.nextInt();
        if (Choice==1){
            System.out.println("ENTER CARD NO");
            int CardNo= sc1.nextInt();
            t1.MakePayment(CardNo,Amt);
        } else if (Choice==2) {
            System.out.println("ENTER UPI PIN");
            int Pin= sc1.nextInt();
            t1.MakePayment(Pin,Amt);
        }
    }
}
