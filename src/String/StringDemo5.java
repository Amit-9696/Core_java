package String;

import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the string");
        String s1= sc1.nextLine();
        s1=s1.toUpperCase();
        int count=0;

        for (int a=0;a<s1.length();a++)
        {
            char c=s1.charAt(a);
            if (c=='A'|| c=='E'|| c=='I'||c=='O'||c=='U');
            count++;
        }
        System.out.println("Total Count "+count);
    }
}
