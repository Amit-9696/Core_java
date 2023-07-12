package Compositon;



public class Car {
    //object composition
    static Engine e1=new Engine();
    Wheels w1=new Wheels();

    void drive(){
        System.out.println("Driving a Car");
    }
}
