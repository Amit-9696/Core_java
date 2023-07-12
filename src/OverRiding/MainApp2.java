package OverRiding;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Select Type Of Plan");
        System.out.println("1:Prepaid");
        System.out.println("2:Postpaid");
        String Choice= sc1.next();
        System.out.println("Select Service Provider");
        System.out.println("1:Airtel\t\t2:Jio");
        int Service= sc1.nextInt();
        if (Service==1){
            Airtel a1=new Airtel();
            if (Choice.equalsIgnoreCase("Prepaid")){
                System.out.println("Select Prepaid Plan");
                System.out.println("1:199\t\t2:299");
                int Plan= sc1.nextInt();
                a1.Recharge(Choice,Plan);
            } else if (Choice.equalsIgnoreCase("Postpaid")) {
                System.out.println("Select Postpaid Plan");
                System.out.println("1:399\t\t2:499");
                int Plan= sc1.nextInt();
                a1.Recharge(Choice,Plan);
            }
        } else if (Service==2) {
            Jio j1=new Jio();
            if (Choice.equalsIgnoreCase("Prepaid")){
                System.out.println("Select Prepaid Plan");
            System.out.println("1:149\t\t2:249");
            int Plan= sc1.nextInt();
            j1.Recharge(Choice,Plan);
        } else if (Choice.equalsIgnoreCase("Postpaid")) {
                System.out.println("Select Postpaid Plan");
                System.out.println("1:299\t\t2:349");
                int Plan = sc1.nextInt();
                j1.Recharge(Choice, Plan);
            }
        }
    }
}
