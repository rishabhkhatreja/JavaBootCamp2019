package DesignPattern.Question5;

class BlueColor implements Color {
    @Override
    public void getcolor() {
        System.out.println("color is blue");
    }
    @Override
    public String toString() {
        return "Blue";
    }
}
