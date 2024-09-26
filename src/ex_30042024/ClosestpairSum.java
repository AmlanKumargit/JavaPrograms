package ex_30042024;

import java.util.Arrays;
import java.util.Scanner;

public class ClosestpairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int[] a = new int[5];
        int k = 15;
        int max = Integer.MAX_VALUE;

        int sum, diff, closeF = 0, closeS = 0;
        for (int i = 0; i < 5; i++) {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for (int i = 0; i < 4; i++) {
            for (int j = i+1; j <5 ; j++) {
                sum = a[i]+a[j];
                diff = Math.abs(k - sum);
                if(diff<=max)
                {
                    closeF=a[i];
                    closeS=a[j];
                    max=Math.abs(k - (a[i]+a[j]));
                }
            }
        }
        System.out.println("Closest sum of pairs: "+closeF+" & "+closeS);
    }
}
