package ArrayTest1;

import Arrays.ArrayDemo1;

import java.util.Scanner;

public class Que4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int arr1[][] = new int[3][3];
        int arr2[][] = new int[3][3];
        int arr3[][] = new int[3][3];

        System.out.println("Enter values for array1");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr1[i][j] = sc1.nextInt();
            }
        }
        System.out.println("Enter values for array2");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                arr2[i][j] = sc1.nextInt();
            }
        }
        System.out.println("==========================================================");
        System.out.println("Output Is");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}