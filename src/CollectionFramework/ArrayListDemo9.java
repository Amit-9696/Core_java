package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo9 {
    public static void main(String[] args) {
        ArrayList<String> EmpName=new ArrayList<>();
        ArrayList<Double> Sal=new ArrayList<>();
        ArrayList<Double> IncSal=new ArrayList<>();
        EmpName.add("Bhageshe");
        EmpName.add("Yash");
        EmpName.add("Rushi");
        EmpName.add("Shubham");
        EmpName.add("Om");

        Sal.add(25000.25);
        Sal.add(35000.25);
        Sal.add(45000.25);
        Sal.add(55000.25);
        Sal.add(65000.25);
        //Add increment salary

        for (int a=0;a<Sal.size();a++){
            IncSal.add(Sal.get(a)+Sal.get(a)*10/100);
        }
        System.out.println("NAME\tSAL\tINC.SAL");
        System.out.println("=============================");
        for (int a=0;a<EmpName.size();a++){
            System.out.println(EmpName.get(a)+"\t"+Sal.get(a)+"\t"+IncSal.get(a));
        }
    }
}
