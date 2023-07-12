package Abstract;

public abstract class Demo {
    //Static & Non-Static
    static int a=10;
    int b=20;
    //Non-static abstract & concrete method
    void test(){
        System.out.println("Concrete Method");
    }

    abstract void Display();
    //static concrete method
    static void Info(){
        System.out.println("Info Method");
    }
    //static & Non-static block
    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("Non-Static Block");
    }
    //Constructor
    Demo(){
        System.out.println("Constructor Demo");
    }
}
