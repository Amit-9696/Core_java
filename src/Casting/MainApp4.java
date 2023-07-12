package Casting;

public class MainApp4 {
    public static void main(String[] args) {
        Master m1=new Central();//Upcasting
        m1.Test();

        Central c1= (Central) new Master();//Down casting
        c1.Test();
        c1.Display();
    }
}
