
//Implement Abstract Factory Pattern to create cars of different categories from different countries.

package DesignPattern.Question3;

public class Main {
    public static void main(String[] args) {
        System.out.println(CarFactory.builder(CarType.MICRO, Location.INDIA));
    }
}
