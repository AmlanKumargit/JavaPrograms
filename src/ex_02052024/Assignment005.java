package ex_02052024;
//Prime
import java.util.Scanner;

public class Assignment005 {
    public static void main(String[] args) {
        int i, c=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
           if(n%i==0)
               c++;
        }
        if(c==2)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");


    }
}
