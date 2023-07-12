package ArrayTest1;

import java.util.Scanner;

public class Que1 {
    public static void main(String[] args) {
            int arr1[] = {3,5,7,8,2};
            int arr2[];
            //no. even position : - 3,7,2
            // sq. op.
            //store them inside 2nd arr
            //o/p:- [9,49,4]
            System.out.println("Number at Even Position ");
            for(int i=0;i< arr1.length;i++){

                if(i%2==0){
                    System.out.print(arr1[i] * arr1[i]+"\t");
                }

            }
        }

}
