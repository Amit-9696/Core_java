package Overloading;

public class Swiggy extends Hotel{
    void placeOrder(double CostOfDish,int qty,double DeliveryCharge){
         double totalAmt=(CostOfDish*qty)+DeliveryCharge;
        System.out.println("Total Amt"+totalAmt);
    }
}
