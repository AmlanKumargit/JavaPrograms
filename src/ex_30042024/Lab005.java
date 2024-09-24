package ex_30042024;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
//Find the occurence of a word in a String
public class Lab005 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word to search:");
        String word = sc.nextLine();
        System.out.println("Enter the sentence to search:");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");


        int c=0;
        for(int i=0;i<words.length;i++)
        {

            if(word.equals(words[i]))
                c++;

        }
        System.out.println("Frequency of the word, '"+word+"' is: "+c);
    }
}
