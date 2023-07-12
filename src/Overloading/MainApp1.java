package Overloading;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        Student s1=new Student();
        System.out.println("Select Search Criteria");
        System.out.println("1:Search By Name");
        System.out.println("2:Search By Roll NO");
        int Choice= sc1.nextInt();
        if (Choice==1){
            System.out.println("Enter Name");
            String Name= sc1.next();
            s1.searchStudent(Name);
        } else if (Choice==2){
            System.out.println("Enter Roll NO ");
            int RollNo= sc1.nextInt();
            s1.searchStudent(RollNo);
        }else {
            System.out.println("Invalid Choice");
        }
    }
}
