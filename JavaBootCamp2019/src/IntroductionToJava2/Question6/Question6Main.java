//WAP showing try, multi-catch and finally blocks.

package IntroductionToJava2.Question6;

import java.util.Scanner;

public class Question6Main {
    public static void main(String[] args) {
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number=");
        i=sc.nextInt();
        try
        {
            System.out.println(i/0);
        }
        catch(ArithmeticException e)
        {
            e.printStackTrace();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("finally");
        }
    }
}
