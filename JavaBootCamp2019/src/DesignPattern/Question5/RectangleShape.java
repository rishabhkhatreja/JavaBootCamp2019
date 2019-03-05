package DesignPattern.Question5;


class RectangleShape extends Shape {
    public RectangleShape(Color color, String shapeName) {
        super(color, shapeName);
    }

    @Override
    public String toString() {
        return "RectangleShape{" +
                "color=" + color +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }
}
