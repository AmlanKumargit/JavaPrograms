package ex_30042024;

import java.util.HashMap;
import java.util.Map;

//HashMap
public class Hash001 {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap();
        map.put(1,"Amlan");
        map.put(2,"Kumar");
        map.put(3,"Aman");
        System.out.println(map+" "+map.size());
        map.remove(3);
        System.out.println(map.containsKey(3));
        System.out.println(map+" "+map.size());
        map.put(2,"Abhishek");
        System.out.println(map);

        HashMap<Integer,String> map2 = new HashMap<Integer,String>(map);
        System.out.println("Map2: "+map2);

        //traverse map
        System.out.println("\nMap 'map' elements:\n");
        for(Map.Entry<Integer, String> m:map.entrySet())
        {
            System.out.println("Key: "+m.getKey()+"\t"+"Value: "+m.getValue());

        }
    }
}
