package ex_30042024;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//remove mapping while iterating hashmap
public class Hash002{
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap();
        map.put(1,"Amlan");
        map.put(2,"Kumar");
        map.put(3,"Aman");

        Iterator itr = map.entrySet().iterator();

        while(itr.hasNext()) {
            Map.Entry<Integer, String> m = (Map.Entry<Integer, String>) itr.next();

            if (m.getKey().equals(3))
            {
                itr.remove();
            }

        }
        System.out.println(map.get(3));
        System.out.println(map);
        }
}
