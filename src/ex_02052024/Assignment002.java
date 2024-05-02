package ex_02052024;
//Largest in 3

import java.util.Scanner;

public class Assignment002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer:");
        int x = sc.nextInt();
        System.out.println("Enter the second integer:");
        int y = sc.nextInt();
        System.out.println("Enter the third integer:");
        int z = sc.nextInt();
        int max = (x>y) ? ((x>z)?x:z):((y>z)?y:z);
        System.out.println("Maximum number is: "+max);
    }
}
