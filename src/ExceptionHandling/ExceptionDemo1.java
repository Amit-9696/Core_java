package ExceptionHandling;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("Program Started");
        String s=null;
        try {
            System.out.println("LENGTH "+s.length());
        }catch (NullPointerException n){
            System.out.println(n);
        }
        System.out.println("Program Ended");
    }
}
