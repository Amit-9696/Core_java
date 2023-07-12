package Casting;

public class MainApp6 {
    public static void main(String[] args) {
        Mobile m1=new SmartPhone();//Upcasting
        m1.getType();
        System.out.println("==============================");
        SmartPhone s1= (SmartPhone) m1;//Down casting
        m1.getType();
        ((SmartPhone) m1).getInfo();
    }
}
