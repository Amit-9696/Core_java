package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo7 {
    public static void main(String[] args) {
        ArrayList<Integer> data=new ArrayList<>();
        data.add(37);
        data.add(12);
        data.add(97);
        data.add(87);
        data.add(45);
        System.out.println(data);
        //sort data in ascending order
        Collections.sort(data);
        System.out.println(data);
        //sort data in descending order
        Collections.sort(data,Collections.reverseOrder());
        System.out.println(data);
    }
}
