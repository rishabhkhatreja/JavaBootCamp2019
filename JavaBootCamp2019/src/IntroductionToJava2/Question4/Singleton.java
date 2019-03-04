package IntroductionToJava2.Question4;

public class Singleton {
    int demo_id;
    private static Singleton t=new Singleton();
    private Singleton()
    {
        demo_id=101;
    }
    public static Singleton getDemo()
    {
        return t;
    }
}
