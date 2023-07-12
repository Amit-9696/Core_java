package Encapsulation;
//SingleTon Class
public class GoogleAccount {
    static int Count=0;
    static GoogleAccount g1;
    private GoogleAccount(){
        Count++;
    }
    //SingleTon Method
    static GoogleAccount login(){
        if (Count==0){
            //SingleTon object
            g1=new GoogleAccount();
            System.out.println("Login Successfully ");
        }else {
            System.out.println("Already Logged IN");
        }
        return g1;
    }
    void gmail(){
        System.out.println("Accessing Gmail");
    }
    void Drive(){
        System.out.println("Accessing Drive");
    }
}
