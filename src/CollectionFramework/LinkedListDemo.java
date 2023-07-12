package CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> data=new LinkedList<>();
        data.add("JAVA");
        data.add("PYTHON");
        data.add("C++");
        data.addFirst("C");
        System.out.println(data);
        data.removeFirst();
        System.out.println(data);
        data.add(1,"PHP");
        System.out.println(data);
    }
}
