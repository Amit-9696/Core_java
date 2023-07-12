package Chaining;

public class Department extends College{
    public Department(String University,String College,String Department){
        super(University,College);
        System.out.println("DEPARTMENT "+Department);
    }
}
