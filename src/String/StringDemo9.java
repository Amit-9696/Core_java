package String;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter your Name");
        String name= sc1.nextLine();
        String username=name.trim();
        boolean status=username.isEmpty();
        if (status==false){
            System.out.println("Welcome "+username);
        }
        else {
            System.out.println("Invalid Name ");
        }
    }
}
