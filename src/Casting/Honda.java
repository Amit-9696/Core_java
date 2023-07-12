package Casting;

public class Honda extends Car{
    @Override
    void getModelName() {
        System.out.println("Model Name Is Honda ");
    }

    @Override
    void getFuelType() {
        System.out.println("Fuel type Is Petrol");
    }
    void refuelTank(double liter){
        double capacity=16;
        double billAmt=DieselPrice*liter;
        System.out.println("TotalAmt"+billAmt);
    }

}
