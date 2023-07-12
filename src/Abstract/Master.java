package Abstract;

public abstract class Master {
    //Non-static variable
    double d=36.45;
    //non-static method
    abstract void test();
    void Display(){
        System.out.println("Display Method");
    }
    //non-static block
    {
        System.out.println("Non-Static Block");
    }
    //Constructor
    Master (int a){
        System.out.println("SuperClass Constructor");
    }
}
