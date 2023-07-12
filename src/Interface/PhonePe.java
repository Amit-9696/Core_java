package Interface;
//multi inheritance
public class PhonePe implements UPIPayment,WalletPayment {
    @Override
    public void BankTransfer(double amt) {
        System.out.println(amt+" RS Transferred To Bank Account ");
    }

    @Override
    public void SendMoney(double amt) {
        System.out.println(amt+" RS Added To Wallet");
    }
}
