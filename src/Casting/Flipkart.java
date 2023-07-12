package Casting;

public class Flipkart extends Ecommerce{
    //General Properties
    @Override
    void SellProduct(int qty, double Price) {
        double total=qty*Price;
        //10% Discount
        double FinalAmt=total-total*0.1;
        System.out.println("Final Amount"+FinalAmt);
    }
    //Specific Properties
    void SellGrocery(){
        System.out.println("Sell Grocery");
    }
}
