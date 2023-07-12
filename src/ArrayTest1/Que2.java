package ArrayTest1;

import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int Size[]=new int[5];
        int min;
        for (int b=0;b<Size.length;b++){
            Size[b]= sc1.nextInt();
            break;
        }
        System.out.println("Enter Value");
        for (int a=0;a<Size.length;a++) {
            Size[a]= sc1.nextInt();

            }
        min=Size[0];
        for (int a=0;a<Size.length;a++){
            if (Size[a]<min){
                min=Size[a];
            }
        }
        System.out.print("Minimum element from an array is "+min);
    }
}


