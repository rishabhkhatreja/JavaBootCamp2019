package DesignPattern.Question6;

public class Ketchup implements Pizza {

    private Pizza pizza;
    private String ketchupType;//mustard,tomato,greenchilli...!

    public Ketchup(Pizza pizza, String ketchupType) {
        this.pizza = pizza;
        this.ketchupType = ketchupType;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getKetchupType() {
        return ketchupType;
    }

    public void setKetchupType(String ketchupType) {
        this.ketchupType = ketchupType;
    }

    @Override
    public String info() {
        return pizza.info()+" with Ketchup "+ketchupType;
    }
}
