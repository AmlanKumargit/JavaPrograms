package ex_02052024;
//Leap year
import java.util.Scanner;

public class Assignment004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int a = sc.nextInt();
        if(a%4==0 || a%400 ==0)
            System.out.println("Year is a leap year");
        else if(a%100==0)
            System.out.println("Not a leap year");
        else
            System.out.println("Not a leap year");

    }
}
