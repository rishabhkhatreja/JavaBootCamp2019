package DesignPattern.Question5;

class TriangleShape extends Shape {
    public TriangleShape(Color color, String shapeName) {
        super(color, shapeName);
    }

    @Override
    public String toString() {
        return "TriangleShape{" +
                "color=" + color +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }
}
