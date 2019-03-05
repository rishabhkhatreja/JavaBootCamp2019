
//Implement Decorator pattern to decorate the Pizza with topings.

package DesignPattern.Question6;

public class Main {
    public static void main(String[] args) {
        PizzaBaseMedium pizzaSize=new PizzaBaseMedium("ThinCrust");
        System.out.println(pizzaSize.info());
        Ketchup ketchup=new Ketchup(new PizzaBaseLarge("PanBase"),"Tomato");
        System.out.println(ketchup.info());
        Toppings toppings=new Toppings(new Ketchup(new PizzaBaseRegular("ThinCrust"),"Mustard"),"Veg");
        System.out.println(toppings.info());
    }
}
