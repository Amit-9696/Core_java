package Abstraction;

public class AxisBank implements Account{
    //step-2
    //class-->decide how an object should behave
    double AccountBalance;
    //Account creation
    public AxisBank(double AccountBalance){
        if (AccountBalance>=10000){
            this.AccountBalance=AccountBalance;
            System.out.println("Account Created Successfully");
        }else {
            System.out.println("Minimum Balance Must Be 10000");
        }
    }
    @Override
    public void deposit(double amt) {
        AccountBalance+=amt;
        System.out.println(amt+"RS Credited To Your Account");
    }

    @Override
    public void withdraw(double amt) {
        if (amt<=AccountBalance){
            AccountBalance-=amt;
            System.out.println(amt+"RS Debited To Your Account");
        }else {
            System.out.println("Insufficient Account Balance");
        }
    }

    @Override
    public void CheckBal() {
        System.out.println("Account Balance Is "+AccountBalance);
    }
}
