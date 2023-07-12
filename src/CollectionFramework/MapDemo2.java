package CollectionFramework;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<Integer,Character> data=new LinkedHashMap<>();
        data.put(65,'A');
        data.put(66,'B');
        data.put(67,'C');
        System.out.println(data);
        //Print All The Keys
        Set<Integer> Keys=data.keySet();
        for (Integer a:Keys){
            System.out.println(a);
        }
        //Print All The Values
        Collection<Character> Values=data.values();
        for (Character c:Values){
            System.out.println(c);
        }
        //Print All Key And Value Pairs
        Set<Map.Entry<Integer,Character>> entries=data.entrySet();
        System.out.println("Keys\tValues");
        for (Map.Entry<Integer,Character> e:entries){
            System.out.println(e.getKey()+"\t\t"+e.getValue());
        }
    }
}
