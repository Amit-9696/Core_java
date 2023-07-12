package CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<String> data=new ArrayList<>();
        data.add("JAVA");
        data.add("J2EE");
        data.add("SQL");
        //Option-1
        System.out.println(data);
        System.out.println("======================");
        //Option-2
        for (int a=0;a<data.size();a++){
            System.out.println(data.get(a));

        }
        //Option-3 Enhanced for Loop
        System.out.println("====================");
        for (String s:data){
            System.out.println(s);
        }
    }
}
