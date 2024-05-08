package ex_08052024;

import java.util.Scanner;

public class Lab002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to find the factorial of the number:");
        int n = sc.nextInt();
        long fact=1;
        System.out.println("Factorial of "+n+":");
        do{
            fact*=n;
            n--;
        }while(n>1);
        System.out.println(fact);
        sc.close();
    }
}
