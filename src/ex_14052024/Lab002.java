package ex_14052024;

import java.util.Scanner;

public class Lab002 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.next();

        StringBuffer sb = new StringBuffer(str);
        String rev = sb.reverse().toString();
        System.out.println("Reverse = "+rev);

        if(rev.equalsIgnoreCase(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
