/*
WAP to read words from the keyboard until the word done is entered. For each word except done, report whether its first character is equal to its last character. For the required loop, use a
a)while statement
b)do-while statement
 */


package IntroductionToJava2.Question8;

import java.util.Scanner;

public class Question8Main {

    public static void main(String[] args) {

        DoWhileDemo();
        whileDemo();
    }

    private static void whileDemo() {

        Scanner sc=new Scanner(System.in);
        String word="";
        while(!word.equals("done"))
        {
            System.out.println("You are in While Loop Enter the word");
            word = sc.next();
            word=word.toLowerCase();
            if(word.charAt(0)==word.charAt(word.length()-1))
            {
                System.out.println("This word is having both first and last character equal="+word);
            }
        }
        System.out.println("terminated while loop");

    }

    private static void DoWhileDemo() {
        Scanner sc=new Scanner(System.in);
        String word;
        do
        {
            System.out.println("You r in Do while loop Enter the word");
            word = sc.next();
            word=word.toLowerCase();
            if(word.charAt(0)==word.charAt(word.length()-1))
            {
                System.out.println("This word is having both first and last character equal="+word);
            }
        }while(!word.equals("done"));

        System.out.println("terminated do while loop");
    }
}
