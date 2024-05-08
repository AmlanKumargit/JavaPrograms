package ex_08052024;

import java.util.Scanner;
//factorial using while loop
public class Lab001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer to find the factorial of the number:");
        int n = sc.nextInt();
        int i = 1;
        long fact = 1;
        System.out.println("Factorial of "+n+":");
        while(i<=n){
            fact*=i;
            i++;
        }
        System.out.println(fact);
        sc.close();
    }
}
