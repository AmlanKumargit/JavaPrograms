package ex_02052024;

//Positive/Negative Number

import java.util.Scanner;

public class Assignment001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int a = sc.nextInt();
        if(a==0)
            System.out.println("Number entered is Zero(0)");
        else if(a<0)
            System.out.println("Number entered is Negative(<0)");
        else
            System.out.println("Number entered is Positive(>0)");
    }
}
