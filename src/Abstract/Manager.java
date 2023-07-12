package Abstract;

public class Manager extends Employee{
    @Override
    void CalculateSalary(double CurrentSalary) {
        //5% pf amount
        double total=CurrentSalary-CurrentSalary*0.05;
        System.out.println("NET Salary "+total);
    }

    @Override
    void getDesignation() {
        System.out.println("Designation is Manager");
    }
}
