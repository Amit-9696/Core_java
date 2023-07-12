package Arrays;

import java.util.Scanner;

public class ArrayDemo3 {
    public static void main(String[] args) {

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter no of Employee");
        int emp=sc1.nextInt();

        double[] sal=new  double[emp];
        System.out.println("Enter sal for Employee");

        for (int c=0;c<emp;c++){
            sal[c]= sc1.nextDouble();
        }
        System.out.println("========================");
        System.out.println("Your Employee sal");
        System.out.println("========================");

        double incsal=0.0;
        System.out.println("orignal sal"+"\t"+"increment sal");

        for (int c=0;c<emp;c++){
            if (sal[c]< 20000){
                incsal=sal[c]+sal[c]*0.10;
                System.out.println(sal[c]+"\t\t\t"+incsal);
            } else if (sal[c]>=20000) {
                incsal=sal[c]+sal[c]*0.05;
                System.out.println(sal[c]+"\t\t\t"+incsal);

            }
        }
    }
}
