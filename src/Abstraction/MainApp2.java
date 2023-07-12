package Abstraction;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        AccountFactory factory=new AccountFactory();
        Scanner sc=new Scanner(System.in);
        System.out.println("Select Bank");
        System.out.println("1:Axis Bank\n2:SBI Bank");
        int choice=sc.nextInt();
        System.out.println("Enter Initial Balance");
        double balance= sc.nextDouble();
        Account factoryAccount=factory.CreateAccount(choice,balance);
        boolean status=true;
        while (status){
            System.out.println("Select Mode Of Transaction");
            System.out.println("1:Deposit\n2:Withdraw\n3:Check Balance\n4:Exit");
            int mode= sc.nextInt();
            if (mode==1){
                System.out.println("Enter Amount");
                double amount= sc.nextDouble();
                factoryAccount.deposit(amount);
            } else if (mode==2) {
                System.out.println("Enter Amount");
                double amount= sc.nextDouble();
                factoryAccount.withdraw(amount);
            } else if (mode==3) {
                factoryAccount.CheckBal();
            }else {
                status=false;
            }
        }
    }
}
