package Casting;

public class MainApp2 {
    public static void main(String[] args) {
        Amazon a1=new Amazon();
        a1.SellProduct(2,1000);
        a1.UsePrimeVideo();

        Flipkart f1=new Flipkart();
        f1.SellProduct(2,1000);
        f1.SellGrocery();
        System.out.println("================================");
        //Access Only General Properties
        Ecommerce e1;
        e1=new Amazon();//Upcasting
        e1.SellProduct(4,500);
        System.out.println("================================");
        e1=new Flipkart();//Upcasting
        e1.SellProduct(4,500);
    }
}
