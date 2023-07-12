package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<Integer> data=new ArrayList<>();
        data.add(50);
        data.add(47);
        data.add(65);
        data.add(1,35);
        data.remove(new Integer(47));//object Remove
        data.add(87);
        data.set(2,98);
        data.remove(3);
        System.out.println(data.get(2));//98
        data.add(73);
        System.out.println(data);
    }
}
