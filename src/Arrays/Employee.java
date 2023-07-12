package Arrays;

public class Employee {
        int[] empId = {101, 102, 103, 104};
        double[] empSal = {15000, 20000, 25000, 30000};
        String[] empName={"A","B","C","D"};


        void searchSal(int id){
            boolean status=false;
            for (int a=0;a<empId.length;a++)
                if (id==empId[a]){
                    System.out.println("Emp Sal Is"+empSal[a]);
                    status=true;
                }
            if (!status){
                System.out.println("Record Not Found");
            }
        }
        void  searchName(int id){
            boolean status=false;
            for (int a=0;a<empId.length;a++){
                if (id==empId[a]){
                    System.out.println("Emp Name is"+empName[a]);
                }
                if (!status){
                    System.out.println("Record Not Found");
                }
            }
        }
    }
