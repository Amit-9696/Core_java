package Casting;

import java.util.Scanner;

public class MainApp3 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Select Type Of TV");
        System.out.println("1:LED");
        System.out.println("2:LCD");
        int Choice= sc1.nextInt();
        TV t1=null;
        if (Choice==1){
            t1=new LED();//Upcasting
        } else if (Choice==2) {
            t1=new LCD();//Upcasting
        }
        if (t1!=null){
            t1.getType();
        }else {
            System.out.println("Invalid Choice");
        }
    }
}
