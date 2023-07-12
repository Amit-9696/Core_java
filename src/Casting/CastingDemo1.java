package Casting;

public class CastingDemo1 {
    public static void main(String[] args) {
        int a=10;//matching info
        System.out.println(a);
        //Narrowing
        int b= (int) 30.25;
        System.out.println(b);//30
        //widening
        double d=56;
        System.out.println(d);//50.0
    }
}
