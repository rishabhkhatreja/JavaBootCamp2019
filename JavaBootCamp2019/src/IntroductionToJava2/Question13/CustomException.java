package IntroductionToJava2.Question13;

public class CustomException extends RuntimeException {

    CustomException(String s)
    {
        super(s);
    }
    @Override
    public synchronized Throwable fillInStackTrace() {
        return  null;
    }
}
