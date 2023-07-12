package ExceptionHandling;

import Casting.Sample;

import java.util.Scanner;

public class ExceptionDemo11 {
    public static void main(String[] args) {
        System.out.println("Program Started");
        Scanner sc1=new Scanner(System.in);
        int[] data=new int[5];
        String s1="java";
        try {
            System.out.println("Enter First No");
            data[1]= sc1.nextInt();
            System.out.println("Enter Second No");
            data[2]= sc1.nextInt();
            int result=data[1]*data[2];
            System.out.println("RESULT "+result);
            try {
                System.out.println("Replace "+s1.replace("j","J"));
            }catch (ArithmeticException a){
                System.out.println(a);
            }

        }catch (NullPointerException n){
            System.out.println(n);
        }finally {
            System.out.println("Closing Costly Resources");
        }
        System.out.println("Program Ended");
    }
}
