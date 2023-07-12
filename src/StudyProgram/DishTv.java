package StudyProgram;

public class DishTv implements SetupBox{

    @Override
    public void getServiceName() {
        System.out.println("Service Provider Is DishTV");
    }

    @Override
    public void Price(int month) {
        double OneMonthRecharge=250;
        double total=month*OneMonthRecharge;
        System.out.println("Total Recharge "+total);
    }
}
