package ex_14052024;

import java.util.Scanner;

public class Lab001 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements:");
        int[][] arr = new int[3][3];

        for(int i= 0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the value for row: "+i+" and column: "+j);
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nThe entered array elements: ");
        for(int i= 0;i<3;i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println("\n");
        }

    }
}
