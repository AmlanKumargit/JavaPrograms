package ex_30042024;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Calculate duplicate words and frequency using HashMaps
public class Hash003 {
    public static void main(String[] args) {

        String s = "Good boys are boys";
        String[] words = s.split(" ");
        HashMap<String, Integer> wordCount = new HashMap<>();

        for(String word : words) {
            if(wordCount.containsKey(word.toLowerCase()))
            {

                wordCount.put(word.toLowerCase(),wordCount.get(word.toLowerCase())+1);
            }
            else
            {
                wordCount.put(word.toLowerCase(),1);
            }
        }
       /* Set<String> s1 = wordCount.keySet();
        for(String word:s1)
        {
            if(wordCount.get(word)>1)
                System.out.println("number of words: "+wordCount.get(word));
        }*/
        for(Map.Entry<String, Integer> m:wordCount.entrySet())
        {
            if(m.getValue()>1)
                System.out.println("word: "+m.getKey() + "\n" + "frequency: "+m.getValue());
        }
    }
}
