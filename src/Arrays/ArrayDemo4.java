package Arrays;

import java.util.Scanner;

public class ArrayDemo4 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the count");
        int count = sc1.nextInt();

        int[] OrignalValue = new int[count];
        int[] Square = new int[count];
        System.out.println("Enter value");

        for (int a = 0; a < count; a++) {
            OrignalValue[a] = sc1.nextInt();
        }
        for (int a = 0; a < count; a++) {
            Square[a] = OrignalValue[a] * OrignalValue[a];
        }
        System.out.println("org value \t square \t Add");
        for (int a = 0; a < count; a++) {
            double Result = OrignalValue[a] + Square[a];
            System.out.println(OrignalValue[a] + "\t\t\t" + Square[a] + "\t\t\t" + Result);
        }
    }
}
