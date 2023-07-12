package Overloading;

public class Hotel {
    void placeOrder(double CostOfDish,int qty){
        double totalAmt=CostOfDish*qty;
        System.out.println("Total Amt "+totalAmt);
    }
}
