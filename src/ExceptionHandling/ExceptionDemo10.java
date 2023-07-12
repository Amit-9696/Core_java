package ExceptionHandling;

import java.util.Scanner;

public class ExceptionDemo10 {
    public static void main(String[] args) {
        System.out.println("Program Started");
        Scanner sc1=new Scanner(System.in);
        String s="JAVA";
        try {
            try {
            System.out.println("Enter First No");
            int no1 = sc1.nextInt();
            System.out.println("Enter Second No");
            int no2 = sc1.nextInt();
            int result=no1/no2;
                System.out.println("RESULT "+result);
            }catch (ArithmeticException a){
                System.out.println(a);
            }
            System.out.println("LENGTH "+s.length());
        }catch (NullPointerException n){
            System.out.println(n);
        }
        System.out.println("Program Ended");
    }
}
