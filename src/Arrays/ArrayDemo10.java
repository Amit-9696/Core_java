package Arrays;

import java.util.Scanner;

public class ArrayDemo10 {
    public static void main(String[] args) {
        Product p1=new Product();
        //create ref of scanner class
        Scanner sc1=new Scanner(System.in);
        //accept count of bill
        System.out.println("ENTER TOTAL NO OF BILLS");
        int count= sc1.nextInt();
        //create array of type double to store amt
        double[] billAmounts=new double[count];
        //accept bill amount
        for (int a=0;a<count;a++){
            billAmounts[a]= sc1.nextDouble();
        }
        //call method from business class
        p1.calculateBill(billAmounts);
    }
}
