package Casting;

public class CastingDemo3 {
    public static void main(String[] args) {
        char ch1='J';
        char ch2='Q';
        //Widening
        int x1=ch1;
        int x2=ch2;
        System.out.println(x1+"\t\t"+x2);//74 & 81
        //Narrowing
        int x3=78;
        char ch3= (char) x3;
        System.out.println(ch3);//N
    }
}
