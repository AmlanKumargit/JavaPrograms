package ex_30042024;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class SumofNuminString {
    public static void main(String[] args) {
        String s = "10101010abcd20202020";
        String s1=s.replaceAll("[^0-9]"," ");
        String s2[]=s1.split(" ");
        System.out.println("Numbers: "+ s1);
        int num=0;

        for(int i = 0; i < s2.length; i++) {

                if(!s2[i].isEmpty())
                    num = num + Integer.parseInt(s2[i]);

            }

        System.out.println("Sum of digits: "+num);
        }



    }

