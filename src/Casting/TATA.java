package Casting;

public class TATA extends Car{
    @Override
    void getModelName() {
        System.out.println("Model Name Is TATA");
    }

    @Override
    void getFuelType() {
        System.out.println("Fuel type Is Diesel");
    }

    void refuelTank(double liter){
        double capacity=14;
        double billAmt=PetrolPrice*liter;
        System.out.println("TotalAmt"+billAmt);
    }
}
