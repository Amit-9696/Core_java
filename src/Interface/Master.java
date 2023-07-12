package Interface;

public interface Master {
    //Public static final variable
    int a=10;
    //non-static abstract
    void test();
    //static concrete method
    static void Display(){
        System.out.println("Display Method");
    }
}
