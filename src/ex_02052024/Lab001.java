package ex_02052024;

import java.util.Scanner;

public class Lab001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a = sc.nextInt();
        if(a%2==0)
            System.out.println("Its an even number");
        else
            System.out.println("Its an odd number");

        sc.close();
    }
}
