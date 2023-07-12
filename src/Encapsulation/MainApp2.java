package Encapsulation;

public class MainApp2 {
    public static void main(String[] args) {
        Employee emp1=new Employee(101,"Emp1",55000);
        Employee emp2=new Employee(102,"Emp3",25000);
        emp2.setEmpName("Emp2");
        System.out.println("EMP ID :"+emp1.getEmpId());
        System.out.println("EMP NAME :"+emp1.getEmpName());
        System.out.println("EMP SAL :"+emp1.getEmpSal());
        System.out.println("-----------------------------");
        System.out.println("EMP ID :"+emp2.getEmpId());
        System.out.println("EMP NAME :"+emp2.getEmpName());
        System.out.println("EMP SAL :"+emp2.getEmpSal());
    }
}
