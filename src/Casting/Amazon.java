package Casting;

public class Amazon extends Ecommerce{
    //General

    @Override
    void SellProduct(int qty, double Price) {
        double total=qty*Price;
        //5% Discount
        double FinalAmt=total-total*0.05;
        System.out.println("Final Amount"+FinalAmt);
    }
    //
    void UsePrimeVideo(){
        System.out.println("Use Amazon Prime Video");
    }
}
