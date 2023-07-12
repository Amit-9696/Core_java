package LoopingStatment;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Addition By Value");
        System.out.println("2.Divide By Value");
        System.out.println("3.Multiply By Value");
        System.out.println("Exit");
        System.out.println("Enter your Choice");
        int choice= sc.nextInt();
        switch (choice)
        {
            case 1:
                int a=20;
                System.out.println("Enter Add");
                double add=sc.nextDouble();
                System.out.println("Addition By Value "+add+a);
            case 2:
                int b=40;
                System.out.println("Enter Div");
                double div=sc.nextDouble();
                System.out.println("Divide By Value"+div/b);
            case 3:
                int c=5;
                System.out.println("Enter Mul");
                double mul=sc.nextDouble();
                System.out.println("Multiply By Value"+mul/c);

        }
    }
}
