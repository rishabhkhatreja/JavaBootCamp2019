package DesignPattern.Question6;

public class PizzaBaseRegular implements Pizza {
    private String type;//thincrust,panbase

    public PizzaBaseRegular(String type) {
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
        return "Pizza Base Regular type is : " + type;
    }

}
