package StudyProgram;

public class TataSky implements SetupBox{

    @Override
    public void getServiceName() {
        System.out.println("Service Provider Is TATASky");
    }

    @Override
    public void Price(int month) {
        double OneMonthRecharge=350;
        double total=month*OneMonthRecharge;
        System.out.println("Total Recharge "+total);

    }
}
