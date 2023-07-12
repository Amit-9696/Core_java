package Abstract;

public class Admin extends Employee{
    @Override
    void CalculateSalary(double CurrentSalary) {
        //3% PF Amount
        double total=CurrentSalary-CurrentSalary*0.03;
        System.out.println("NET Salary "+total);
    }

    @Override
    void getDesignation() {
        System.out.println("Designation is Admin");
    }
}
