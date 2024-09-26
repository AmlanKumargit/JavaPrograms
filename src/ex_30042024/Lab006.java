package ex_30042024;

import java.util.Arrays;
import java.util.Scanner;
//Number in the array closest to zero
public class Lab006 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element");
        int n = sc.nextInt();
        System.out.println("Enter numbers");
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i]=Math.abs(sc.nextInt());
        }
        Arrays.sort(a);
        System.out.println("Closest to zero:"+a[0]);


    }
}
