package DesignPattern.Question5;

class RedColor implements Color {

    @Override
    public void getcolor() {
        System.out.println("color is red");
    }
    @Override
    public String toString() {
        return "RED";
    }
}
