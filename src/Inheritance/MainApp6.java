package Inheritance;

public class MainApp6 {
    public static void main(String[] args) {
        KOTAK k1=new KOTAK();
        k1.NetBanking();
        k1.Deposit();
        k1.DisplayBalance();
        k1.Withdraw();
        System.out.println("=========================");
        ICICI i=new ICICI();
        i.MobileBanking();
        i.Deposit();
        i.DisplayBalance();
        i.Withdraw();
        System.out.println("=========================");
        HDFC h=new HDFC();
        h.GoodCustomerServices();
        h.Deposit();
        h.DisplayBalance();
        h.Withdraw();
    }
}
