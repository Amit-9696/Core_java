package Encapsulation;

public class MainApp5 {
    public static void main(String[] args) {
        GoogleAccount account=GoogleAccount.login();//Create Object
        account.gmail();
        account.Drive();
    }
}
