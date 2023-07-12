package ExceptionHandling;

public class ExceptionDemo8 {
    static void First(){
        System.out.println("First Started");
        int c=10/0;
        System.out.println("First Ended");
    }
    static void Second(){
        System.out.println("Second Started");
        First();
        System.out.println("Second Ended");
    }
    static void Third(){
        System.out.println("Third Started");
       try {
           Second();
       }catch (ArithmeticException e){
           System.out.println(e);
       }
        System.out.println("Third Ended");
    }
    public static void main(String[] args) {
        System.out.println("Main Started");
        Third();
        System.out.println("Main Ended");
    }
}
