package Abstraction;

public class TV implements Switch{
    //step-2 implementation
    @Override
    public void SwitchOn() {
        System.out.println("TV SWITCH ON");
    }

    @Override
    public void SwitchOff() {
        System.out.println("TV SWITCH OFF");
    }
}
