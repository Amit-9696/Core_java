package ObjectClass;

public class MainApp1 {
    public static void main(String[] args) {
        TV t1=new TV("SAMSUNG",45000);
        TV t2=new TV("SONY",30000);
        System.out.println(t1);//implicit call to string
        System.out.println(t2.toString());//explicit call to string
    }
}
