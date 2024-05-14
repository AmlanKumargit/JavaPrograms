package ex_14052024;
//Reverse of a string without function or for loop
import java.util.Scanner;

public class Assignment004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();

//        for (int i = str.length(); i > 0; --i) {
//            System.out.println(str.charAt(i-1));
//        } // using for loop

        int i=str.length();
        System.out.println("\nReversed String:");
        while(i>0){
            System.out.println(str.charAt(i-1));
            i--;
        }
    }
}
