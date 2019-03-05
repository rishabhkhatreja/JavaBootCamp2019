package DesignPattern.Question5;

class SquareShape extends Shape {
    public SquareShape(Color color, String shapeName) {
        super(color, shapeName);
    }

    @Override
    public String toString() {
        return "SquareShape{" +
                "color=" + color +
                ", shapeName='" + shapeName + '\'' +
                '}';
    }
}
