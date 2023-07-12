package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Character> data=new ArrayList<>();
        data.add('R');
        data.add('T');
        data.add('W');
        //Option-4 Iterator interface
        Iterator<Character> itr= data.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());//Select
            //itr.remove();//Delete
        }
        //System.out.println(data);
        System.out.println("=======================");
        //Option-5ListIterator interface(ArrayList)
        ListIterator<Character> Ltr= data.listIterator();
        while (Ltr.hasNext()){
            System.out.println(Ltr.next());
            System.out.println(Ltr.previous());
        }
    }
}
