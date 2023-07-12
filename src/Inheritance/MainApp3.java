package Inheritance;

import Compositon.Company;

public class MainApp3 {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        l1.SellProduct(1,35000.36);
        l1.LaptopInfo("HP");
        System.out.println("==============================");
        Mobile m1=new Mobile();
        m1.SellProduct(1,25000.25);
        m1.MobileInfo("ONE PLUS");
    }
}
