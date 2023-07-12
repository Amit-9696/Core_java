package Encapsulation;

public class Employee {
    private int empId;
    private String empName;
    private double empSal;
    public Employee(int EmpId,String EmpName,double EmpSal){
        this.empId=EmpId;
        this.empName=EmpName;
        this.empSal=EmpSal;
    }
    public int getEmpId(){
        return empId;
    }
    public String getEmpName(){
        return empName;
    }
    public double getEmpSal(){
        return empSal;
    }
    public void setEmpName(String empName){
        this.empName=empName;
    }
    public void setEmpId(int empId){
        this.empId=empId;
    }
    public void setEmpSal(double empSal){

    }
}
