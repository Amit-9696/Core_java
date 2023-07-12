package WrapperClass;

public class Demo1 {
    public static void main(String[] args) {
        int a=20;//primitive variable
        Integer i=new Integer(40);//non-primitive
        System.out.println(a+"\t\t"+i);
        Integer b=a;//Auto boxing
        int j=i;//Auto Unboxing
        System.out.println(b+"\t\t"+j);
    }
}
