
//WAP to create singleton class.

package IntroductionToJava2.Question4;

public class Main {
    public static void main(String[] args) {
        Singleton d=Singleton.getDemo();
        System.out.println("object d="+d.demo_id);
        Singleton d1=Singleton.getDemo();
        System.out.println("object d1="+d1.demo_id);
        d1.demo_id=206;
        System.out.println("after change object d1="+d1.demo_id);
        System.out.println("after change object d="+d.demo_id);
    }
}
