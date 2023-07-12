package Encapsulation;
//outer class
public class Laptop {
    String Company="HP";
    double Price=25000.25;

    //inner class
    class RAM{
        String type="DDR4";
        void Display(){
            System.out.println("RAM Type Is "+type);
        }
    }

    //inner class
    class HDD{
        double Size=500;
        void info(){
            System.out.println("HDD Size Is "+Size+"GB");
        }
    }
}
