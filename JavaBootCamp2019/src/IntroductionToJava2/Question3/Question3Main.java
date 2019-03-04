//WAP to produce NoClassDefFoundError and ClassNotFoundException exception.

package IntroductionToJava2.Question3;

public class Question3Main {
    public static void main(String[] args) throws ClassNotFoundException {
            Class.forName("excep");
    }
}

/*
No class def found error occured when I have deleted the BOI class
file from production and after running the program again this error occured.!
 */