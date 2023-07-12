package WhileLoop;

import java.util.Scanner;

public class WhileLoopDemo1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean status=true;
        while (status){
            System.out.println("1.Area of Circle");
            System.out.println("2.Area of square");
            System.out.println("3.Exit");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            if (choice==1)
            {
                System.out.println("Enter Radius");
                double radius=sc.nextDouble();
                System.out.println("Area of Circle is "+3.14*radius*radius);
            }
            else if (choice==2)
            {
                System.out.println("Enter Side");
                double side=sc.nextDouble();
                System.out.println("Area of square is "+side*side);
            }
            else if (choice==3)
            {
                status=false;
            }
            else {
                System.out.println("Invalid Choice");
            }
        }
    }
}
