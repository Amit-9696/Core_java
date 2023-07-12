package Overloading;

public class Student {
        String StudentName="Vijay";
        int StudentRollNo=25;

        void searchStudent(String Name){
            if (Name.equalsIgnoreCase(StudentName)){
                System.out.println("Student Name "+StudentName);
                System.out.println("Student Roll No "+StudentRollNo);
            }else {
                System.out.println("Invalid Details");
            }
        }
        void searchStudent(int RollNo){
            if (RollNo==StudentRollNo){
                System.out.println("Student Name "+StudentName);
                System.out.println("Student Roll NO "+StudentRollNo);
            }else {
                System.out.println("Invalid Details");
            }
        }

}
