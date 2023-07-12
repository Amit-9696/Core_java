package Casting;

import java.util.Scanner;

public class MainAppCar {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Select Option");
        System.out.println("1:Get Car Detail\n2:Refuel");
        int choice=sc.nextInt();

        switch (choice){
            case 1:
                carDetail();
                System.out.println("select car model");
                System.out.println("1:Honda\n2:TATA");
                int status=sc.nextInt();
                if (status==1){
                    Car c1=new Honda();
                    c1.getModelName();
                    c1.getFuelType();
                }else {
                    Car c2 = new TATA();
                    c2.getModelName();
                    c2.getFuelType();
                }
            case 2:

                System.out.println("Select Fuel Type");
                System.out.println("1:Petrol\n2:Diesel");
                fuelcost();
                int Choice=sc.nextInt();
                Car c1=new Honda();
                if (Choice==1) {
                    System.out.println("Enter Liter");
                    c1.
                }

        }
    }

    private static void fuelcost() {

    }


    private static void carDetail() {

    }


}
