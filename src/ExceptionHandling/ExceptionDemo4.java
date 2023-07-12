package ExceptionHandling;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        System.out.println("Program Started");
        int a=10,b=0;
        String s=null;
        try {
            try {//Nested try-catch block
                int c=a/b;
                System.out.println(c);
            }catch (ArithmeticException e){
                System.out.println(e);
            }
            System.out.println("LENGTH"+s.length());
        }catch (NullPointerException e){
            System.out.println(e);
        }
        System.out.println("Program Ended");
    }
}
