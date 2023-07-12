package Compositon;

public class MainApp1 {
    public static void main(String[] args) {
        Car c1=new Car();
        Car.e1.Start();
        c1.drive();
        Car.e1.Stop();
        c1.w1.getType();
    }
}
