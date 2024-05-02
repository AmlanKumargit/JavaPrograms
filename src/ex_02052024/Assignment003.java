package ex_02052024;

import java.util.Scanner;

public class Assignment003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet:");
        char ch = sc.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||

                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println("Character entered is a vowel");
        else
            System.out.println("Character entered is a consonant");

    }

}
