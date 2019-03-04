
//WAP to convert seconds into days, hours, minutes and seconds.

package IntroductionToJava2.Question7;

import java.util.Scanner;

public class Question7Main {
    public static void main(String[] args) {
        int days,hours,min;
        Scanner enter=new Scanner(System.in);
        System.out.println("Enter the seconds=");
        int sec=enter.nextInt();
        days=sec/(24*3600);
        sec=sec-days*(3600*24);
        hours=sec/3600;
        sec=sec-hours*3600;
        min= sec / 60;
        sec=sec-min*60;
        System.out.println("days="+days);
        System.out.println("hours="+hours);
        System.out.println("minutes="+min);
        System.out.println("seconds="+sec);
    }
}
