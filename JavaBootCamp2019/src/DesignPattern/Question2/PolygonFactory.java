package DesignPattern.Question2;

public class PolygonFactory {
    static Polygon getPolygon(String name) {
        Polygon polygon = null;
        switch (name) {
            case "Triangle":
                polygon = new Triangle();
                break;
            case "Hexagon":
                polygon = new Hexagon();
                break;
        }
        return polygon;
    }
}
