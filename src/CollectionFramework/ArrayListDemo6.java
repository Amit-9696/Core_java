package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        //Merging
        ArrayList<Double> data1=new ArrayList<>();
        data1.add(35.25);
        data1.add(78.14);
        data1.add(96.25);
        ArrayList<Double> data2=new ArrayList<>();
        data2.add(45.25);
        data2.add(68.14);
        data2.add(86.25);
        data2.addAll(data1);
        for (Double d:data2){
            System.out.println(d);
        }
    }
}
