package String;

import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter String");
        String str= sc1.nextLine();
        String  str1=str.toLowerCase();
        char[] vowels={'a','e','i','o','u'};
        char[] data=str1.toCharArray();
        for (int a= data.length-1;a>=0;a--){
            if (data[a]=='a'||data[a]=='e'||data[a]=='i'||data[a]=='o'||data[a]=='u'){

            }
            System.out.println("Revers String is "+data[a]);
        }
    }
}
