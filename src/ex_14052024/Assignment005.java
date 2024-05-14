package ex_14052024;

import java.util.Scanner;

//Remove Duplicates from a String
public class Assignment005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String in lower case");
        String str = sc.nextLine();
        String str1="";
        for (int i = 0; i < str.length(); i++) {
            int j;
            for( j = 0; j < i;j++)
                {
                    if(str.charAt(i)==str.charAt(j))
                        break;
                 }
                 if(i==j)
                    str1+=str.charAt(i);

        }
        System.out.println("\nString without duplicates: "+str1);

    }
}
