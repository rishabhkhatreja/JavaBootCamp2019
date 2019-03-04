
/*
Create Java classes having suitable attributes for Library management system.
Use OOPs concepts in your design.Also try to use interfaces and abstract classes.
*/
package IntroductionToJava2.Question1;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
            System.out.println("Please enter who are you librarian or student for librarian enter 1 and for student enter 2");
            Scanner sc=new Scanner(System.in);
            int typeOfUser=sc.nextInt();
            int memberId;
            String passWord;
            if(typeOfUser==1)
            {
                System.out.println("please enter your memberid and password");
                //viewTotalIssuedbook();
                //RequestBook();
                //Payfine();

            }
            else
            {
                System.out.println("enter the librarian password and id");
                // addbook();
                // addmember();
                // issuebook();
                // updateMemberRecord();


            }
    }
}
