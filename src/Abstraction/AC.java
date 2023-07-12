package Abstraction;

public class AC implements Switch{
    //step-2 implementation
    @Override
    public void SwitchOn() {
        System.out.println("AC SWITCH ON");
    }

    @Override
    public void SwitchOff() {
        System.out.println("AC SWITCH OFF");
    }
}
