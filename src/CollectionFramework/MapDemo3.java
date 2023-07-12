package CollectionFramework;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class MapDemo3 {
    public static void main(String[] args) {
        Hashtable<String,String> data=new Hashtable<>();
        data.put("1CCM25","JAVA");
        data.put("1CCM24","JAVA");
        data.put("1CJM8","J2EE");
       // data.put(null,null);//NullPointerException
        System.out.println(data);
        Set<String> Keys=data.keySet();
        for (String a:Keys){
            System.out.println(a);
        }
        Collection<String> Values=data.values();
        for (String b:Values){
            System.out.println(b);
        }
    }
}
