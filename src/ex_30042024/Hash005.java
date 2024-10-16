package ex_30042024;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

//program to reverse each word of a given string
public class Hash005 {
    public static void main(String[] args) {
        String s = "Hello Amlan, today is a good day!";
        String[] s1 = s.split(" ");

        List<String> list =new ArrayList<>();
        for(String i:s1)
        {
            String s3 = i;
            String rev = "";
            for(int j = s3.length()-1; j>=0;j--)
            {
                rev+=s3.charAt(j);
            }
           list.add(rev);
        }
        //Collections.reverse(list); //-- If you just want to reverse the entire string.
        System.out.println("Reversed words in the String: "+ list);

        System.out.println("Current String: "+ s);
        System.out.print("Reversed String: ");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
    }
}
