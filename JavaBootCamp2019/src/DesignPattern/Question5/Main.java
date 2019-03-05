
/*
Implement Bridge Design Pattern for Color and Shape such that Shape and Color can be combined together
 e.g BlueSquare, RedSquare, PinkTriangle etc.
*/
package DesignPattern.Question5;

public class Main {
    public static void main(String[] args) {
        SquareShape blueSquare = new SquareShape(new BlueColor(),"Square");
        System.out.println(blueSquare);
        RectangleShape redRectangle =new RectangleShape(new RedColor(),"Square");
        System.out.println(redRectangle);
        TriangleShape pinkTriangle = new TriangleShape(new PinkColor(),"Triangle");
        System.out.println(pinkTriangle);
    }
}
