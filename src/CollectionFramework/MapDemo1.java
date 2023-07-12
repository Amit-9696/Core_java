package CollectionFramework;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {
        HashMap<Integer,String> data=new HashMap<>();
        data.put(1,"RED");
        data.put(4,"BLUE");
        data.put(3,"GREEN");
        data.put(5,"YELLOW");
        System.out.println(data);
        data.put(4,"WHITE");
        data.put(null,null);
        data.put(9,null);
        System.out.println(data);
    }
}
