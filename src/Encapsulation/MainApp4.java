package Encapsulation;

public class MainApp4 {
    public static void main(String[] args) {
        Machine m1=new Machine() {
            //Anonymous class
            @Override
            public void getType() {
                System.out.println("Machine Type Is Mobile");
            }
        };
        Machine m2=new Machine() {
            //Anonymous class
            @Override
            public void getType() {
                System.out.println("Machine Type Is Laptop");
            }
        };
        m1.getType();
        m2.getType();
    }
}
