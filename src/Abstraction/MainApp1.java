package Abstraction;

public class MainApp1 {
    //presentation or utilization layer
    //end user
    public static void main(String[] args) {
        Switch s1;
        s1=new TV();
        s1.SwitchOn();
        s1.SwitchOff();

        s1=new AC();//upcasting
        s1.SwitchOn();
        s1.SwitchOff();
    }
}
