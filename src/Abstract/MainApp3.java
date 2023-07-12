package Abstract;

import java.util.Scanner;

public class MainApp3 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Current Salary");
        double Salary= sc1.nextDouble();
        System.out.println("Select Designation");
        System.out.println("1 :Manager\n2 :Admin");
        int Choice= sc1.nextInt();
        Employee e1=null;
        if (Choice==1){
            e1=new Manager();//Upcasting
        } else if (Choice==2) {
            e1=new Admin();//Upcasting
        }
        if (e1!=null){
            e1.CalculateSalary(Salary);
            e1.getDesignation();
        }else {
            System.out.println("Invalid Choice");
        }
    }
}
