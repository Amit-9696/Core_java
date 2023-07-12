package Encapsulation;
//Java bean class
//encapsulated class
public class Product {
    private int ProductID=101;
    private double ProductPrice=500.25;
    //getter method-->only read access
    public int getProductID(){
        return ProductID;
    }
    public double getProductPrice(){
        return ProductPrice;
    }
}
