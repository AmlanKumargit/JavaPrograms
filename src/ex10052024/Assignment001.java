package ex10052024;

import java.util.Scanner;

public class Assignment001 {
    public static void main(String[] args) {
        int[] marks = new int[5];
        int i,j;
        System.out.println("\nEnter your marks:");
        Scanner sc = new Scanner(System.in);
        for (i=0;i<marks.length;i++)
        {
                  marks[i]=sc.nextInt();
        }
        System.out.print("\nAll the Marks entered = { ");
        for (j=0;j<marks.length;j++)
        {
            System.out.print(marks[j]+", ");
        }
        System.out.print("}");
    }
}
