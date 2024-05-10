package ex10052024;

import java.util.Scanner;

public class Assignment003 {
    public static void main(String[] args) {
        int[] salary = new int[7];
        int i,j,k,max;
        System.out.println("\nEnter the salaries:");
        Scanner sc = new Scanner(System.in);
        for (i=0;i<salary.length;i++)
        {
            salary[i]=sc.nextInt();
        }
        System.out.print("\nEntered salaries = { ");
        for (j=0;j<salary.length;j++)
        {
            System.out.print(salary[j]+", ");
        }
        System.out.print("}");

        max=salary[0];
        for (k=0;k<salary.length-1;k++) {
            if (salary[k] > salary[k + 1])
                max = salary[k];
        }
        System.out.println("\nHighest(max) Salary: "+salary[k]);
    }
}
