package Abstraction;

public class AccountFactory {
    Account a1=null;
    Account CreateAccount(int choice,double initialBalance){
        if (choice==1){
            a1=new AxisBank(initialBalance);//upcasting
        } else if (choice==2) {
            a1=new SBIBank(initialBalance);//upcasting
        }
        return a1;
    }
}
