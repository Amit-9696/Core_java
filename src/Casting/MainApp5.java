package Casting;

public class MainApp5 {
    public static void main(String[] args) {
        Master m1=new Master();
        if (m1 instanceof Central){
            Central c1= (Central) new Master();
        }else {
            System.out.println("Properties Not Found");
        }
    }
}
