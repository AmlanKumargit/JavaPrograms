package ex10052024;

import java.util.Scanner;

public class Assignment002 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        int i,j;
        System.out.println("\nEnter the numbers:");
        Scanner sc = new Scanner(System.in);
        for (i=0;i<marks.length;i++)
        {
            marks[i]=sc.nextInt();
        }
        System.out.print("\nDoubled numbered array = { ");
        for (j=0;j<marks.length;j++)
        {
            System.out.print(marks[j]*2+", ");
        }
        System.out.print("}");
    }
}
