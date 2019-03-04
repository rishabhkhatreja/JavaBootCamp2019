
//Implement multiple inheritance with default method inside  interface.
package Java8Features.Question8;

public class Main implements InterfaceDemo1,InterfaceDemo{
    public static void main(String[] args) {
        new Main().methodDemo();
    }
    @Override
    public void sum() {
        System.out.println("Implemented sum method of InterfaceDemo1");
    }

    @Override
    public void methodDemo() {
        InterfaceDemo.super.methodDemo();
        InterfaceDemo1.super.methodDemo();
    }
}
