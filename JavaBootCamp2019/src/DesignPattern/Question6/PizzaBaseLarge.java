package DesignPattern.Question6;

public class PizzaBaseLarge implements Pizza {

    private String type;//thincrust,pan base

    public PizzaBaseLarge(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String info() {
        return "Pizza Base Large type is : " + type;
    }
}
