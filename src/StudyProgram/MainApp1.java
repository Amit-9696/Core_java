package StudyProgram;

public class MainApp1 {
    public static void main(String[] args) {
        SetupBox box;
        box=new DishTv();
        box.getServiceName();
        box.Price(2);
        box=new TataSky();
        box.getServiceName();
        box.Price(2);
    }
}
