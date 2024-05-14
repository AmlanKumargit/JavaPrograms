package ex_14052024;

import java.util.Scanner;

//Find element
public class Assignment002 {
    public static void main(String[] args) {
        int[][] arr = {
                {9, 2, 3},
                {4, 5, 6},
                {7, 8, 1}
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. to be searched:");
        int ele = sc.nextInt();
        int c=0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j]==ele)
                        c++;
            }
        }
        if(c==1)
            System.out.println("Element exists");
        else
            System.out.println("Element doesn't exist");


    }
}


