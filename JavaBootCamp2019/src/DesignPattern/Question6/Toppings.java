package DesignPattern.Question6;

public class Toppings implements Pizza {
    private Pizza pizza;
    private String topping;//veg or non veg

    public Toppings(Pizza pizza, String topping) {
        this.pizza = pizza;
        this.topping = topping;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String info() {
        return pizza.info()+" with topping "+topping;
    }
}
