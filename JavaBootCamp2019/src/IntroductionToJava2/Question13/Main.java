
//Create a custom exception that do not have any stack trace.

package IntroductionToJava2.Question13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number=");
        number=sc.nextInt();
        if(number>100)
        {
            throw new CustomException("you have entered number greater than 100");
        }
        else
        {
            System.out.println("thank you");
        }
    }
}
