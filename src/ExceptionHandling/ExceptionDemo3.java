package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        System.out.println("Program Started");
        Scanner sc1=new Scanner(System.in);
        try {
            System.out.println("Enter First No");
            int n1= sc1.nextInt();
            System.out.println("Enter Second No");
            int n2= sc1.nextInt();
            int result=n1/n2;
            System.out.println("RESUL "+result);
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch (InputMismatchException i){
            System.out.println(i);
        }
        System.out.println("Program Ended");
    }
}
