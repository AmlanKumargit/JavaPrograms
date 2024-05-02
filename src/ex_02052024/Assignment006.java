package ex_02052024;
//FizzBuzz
import java.util.Scanner;

public class Assignment006 {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=100;i++)
        {
            if(i%3==0 && i%5!=0)
                System.out.println("Fizz\t");
            else if(i%5==0 && i%3!=0)
                System.out.println("Buzz\t");
            else if(i%3==0 && i%5==0)
                System.out.println("FizzBuzz\t");
            else
                System.out.println(i+"\t");
        }

    }
}
