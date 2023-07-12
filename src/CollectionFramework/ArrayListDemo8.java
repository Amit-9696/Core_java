package CollectionFramework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();
        System.out.println("Enter Starting Value");
        int start= sc.nextInt();
        System.out.println("Enter Ending Value");
        int end=sc.nextInt();
        for (int a=start;a<=end;a++){
            if (a%2==0){
                even.add(a);
            }else {
                odd.add(a);
            }
        }
        System.out.println("Even"+even);
        System.out.println("Odd"+odd);
    }
}
