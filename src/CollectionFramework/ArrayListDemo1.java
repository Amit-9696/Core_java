package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo1 {
    //Non-Generic ArrayList
    public static void main(String[] args) {
        ArrayList data=new ArrayList<>();
        data.add(20);
        data.add("JAVA");
        data.add(78.25);
        data.add(20);
        data.add('H');
        data.add(true);
        data.add(null);
        System.out.println(data);
    }
}
