package DesignPattern.Question5;

abstract class Shape {
    Color color;
    String shapeName;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }



    public Shape(Color color, String shapeName) {
        this.color = color;
        this.shapeName = shapeName;
    }
}
