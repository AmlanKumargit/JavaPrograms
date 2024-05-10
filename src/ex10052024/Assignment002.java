package ex10052024;

import java.util.Scanner;

public class Assignment002 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        int[] marks2 = new int[3];
         int i;
        System.out.println("\nEnter the numbers:");
        Scanner sc = new Scanner(System.in);
        for (i=0;i<marks.length;i++)
        {
            marks[i]=sc.nextInt();
        }
        for (i=0;i<marks.length;i++)
        {
            marks2[i]=marks[i]*2;
        }
        System.out.print("\nDoubled numbered array = { ");
        for (i=0;i<marks.length;i++)
        {
            System.out.print(marks2[i]+", ");
        }
        System.out.print("}");
    }
}
