package Arrays;

import java.util.Scanner;

public class ArrayDemo13 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Total No of Floor ");
        int floors= sc1.nextInt();
        System.out.println("Enter Total No of Flat ");
        int flat= sc1.nextInt();
        int[][] data=new int[floors][flat];
        System.out.println("Enter"+(flat*floors)+"Flat no");
        for (int a=0;a< floors;a++){
            for (int b=0;b< flat;b++){
                data[a][b]= sc1.nextInt();
            }
        }
        for (int a=0;a< data.length;a++){
            System.out.println("Floor No"+(a+1));
            for (int b=0;b< data[a].length;b++){
                System.out.print("Flat No"+data[a][b]+"\t\t");
            }
            System.out.println();
            System.out.println("=================================================");
        }
    }
}
