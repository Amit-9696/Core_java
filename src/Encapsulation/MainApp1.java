package Encapsulation;

public class MainApp1 {
    public static void main(String[] args) {
        Product p1=new Product();
        int id=p1.getProductID();
        double Price=p1.getProductPrice();
        System.out.println("ID "+id);
        System.out.println("Price "+Price);
    }
}
