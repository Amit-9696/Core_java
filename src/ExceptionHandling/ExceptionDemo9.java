package ExceptionHandling;

import java.io.IOException;

public class ExceptionDemo9 {
    static void First()throws IOException{
        throw new IOException();
    }
    static void Second()throws IOException{
        System.out.println("Second Started");
        First();
        System.out.println("Second Ended");
    }
    static void Third(){
        System.out.println("Third Started");
        try {
            Second();
        }catch (Exception e){
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
