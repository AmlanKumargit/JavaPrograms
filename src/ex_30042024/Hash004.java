package ex_30042024;

import java.util.HashMap;
import java.util.Map;

//Java Program to Count Occurrences Of Each Character In String
public class Hash004 {
    public static void main(String[] args) {
        String s = "abcasldjlabcasiejabc";
        char[] c = s.toCharArray();

        HashMap<Character, Integer> map=new HashMap<>();
        for(char ch:c)
        {
            if(map.containsKey(ch))
                map.put(ch,map.get(ch)+1);
            else
                map.put(ch,1);
        }

        for(Map.Entry<Character,Integer> m:map.entrySet())
                {
                    System.out.println("character: "+m.getKey() + " || " + "frequency: "+m.getValue());
                }
    }
}
