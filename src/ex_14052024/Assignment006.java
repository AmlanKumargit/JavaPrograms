package ex_14052024;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

//Java Annagrams
public class Assignment006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String str = sc.next();
        System.out.println("Enter second string");
        String str1 = sc.next();
        str=str.toLowerCase();
        str1=str1.toLowerCase();
        char[] c = str.toCharArray();
        char[] c1 = str1.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);

        if(str.length()==str1.length())
        {
                if(Arrays.equals(c,c1))
                    System.out.println("The strings are anagrams");
                else
                    System.out.println("The strings are not anagrams");
         }
        else
            System.out.println("The strings are not anagrams");
        }

    }

