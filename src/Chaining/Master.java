package Chaining;

public class Master {
    public Master(String s){
        this(50);
        System.out.println("s");//Pune
    }
    public Master(int k){
        this(true);
        System.out.println(k);//50
    }
    public Master(boolean b){
        System.out.println(b);//true
    }
}
