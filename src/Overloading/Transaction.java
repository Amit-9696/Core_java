package Overloading;

public class Transaction {
    int CardNo=12456875;
    int Cvv=123;
    int UpiPin=4578;

    void MakePayment(int CardNo,int Cvv,double totalAmt){
        if (CardNo==this.CardNo&&Cvv==this.Cvv){
            System.out.println("ORDER PLACED SUCCESSFULLY ");
            System.out.println("PAYMENT RECEIVED FOR "+totalAmt);
        }else {
            System.out.println("INVALID CREDENTIAL");
        }
    }
    void MakePayment(int UpiPin,double totalAmt){
        if (UpiPin==this.UpiPin){
            System.out.println("ORDER PLACED SUCCESSFULLY ");
            System.out.println("PAYMENT RECEIVED FOR "+totalAmt+"Rs");
        }else {
            System.out.println("INVALID CREDENTIAL");
        }
    }
}
