package Encapsulation;

public class MainApp3 {
    public static void main(String[] args) {
        Laptop l1=new Laptop();
        System.out.println("Company "+l1.Company);
        System.out.println("Price "+l1.Price);
        //using ref of outer class to create object of inner class
        Laptop.RAM r1=l1.new RAM();
        r1.Display();
        Laptop.HDD d1=l1.new HDD();
        d1.info();
    }
}
