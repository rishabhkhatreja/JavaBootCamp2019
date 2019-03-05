package DesignPattern.Question6;

public class PizzaBaseMedium implements Pizza
{
    private String type;//thincrust,pan base

    public PizzaBaseMedium(String type) {
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
        return "Pizza Base Medium type is : " + type;
    }
}

