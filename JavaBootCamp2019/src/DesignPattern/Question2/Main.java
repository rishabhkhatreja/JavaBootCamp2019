
//Implement Factory Pattern to get the Polygon of differnt type.

package DesignPattern.Question2;

public class Main {
    public static void main(String[] args)
    {
        Polygon triangle = PolygonFactory.getPolygon("Triangle");
        triangle.polygonInfo();
        Polygon hexagon = PolygonFactory.getPolygon("Hexagon");
        hexagon.polygonInfo();
    }
}
