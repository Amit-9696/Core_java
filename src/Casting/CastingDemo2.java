package Casting;

public class CastingDemo2 {
    public static void main(String[] args) {
        //Matching Info
        float no1=35.358f;
        int no2=87;
        System.out.println(no1+"\t\t"+no2);
        //Narrowing
        int no3=(int) no1;//35
        //Widening
        float no4=no2;
        System.out.println(no3+"\t\t"+no4);//87.0
    }
}
