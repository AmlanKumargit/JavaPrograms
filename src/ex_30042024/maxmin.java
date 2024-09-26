package ex_30042024;

import java.util.Arrays;
import java.util.Scanner;

public class maxmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        int[] a = new int[5];
        //int max = a[0];

        for (int i = 0; i < 5; i++) {
            a[i]=sc.nextInt();
        }
        /*for (int i = 0; i < 5; i++) {
            if(a[i]>max)
               max=a[i];
        }
        int min = a[0];
        for (int i = 1; i < 5; i++) {
            if(a[i]<min)
             min=a[i];
        }*/
        Arrays.sort(a);
        System.out.println("Max element:"+a[4]+"\nMin element:"+a[0]);
    }
}
