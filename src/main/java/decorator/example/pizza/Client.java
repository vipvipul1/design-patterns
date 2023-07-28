package decorator.example.pizza;

import decorator.example.pizza.addonpizza.Cheese;
import decorator.example.pizza.addonpizza.Paneer;
import decorator.example.pizza.addonpizza.Tomato;
import decorator.example.pizza.basepizza.BBQChicken;

public class Client {
    public static void main(String[] args) {
        Pizza pizza = new Paneer(new Cheese(new Tomato(new BBQChicken())));
        System.out.println(pizza.getCost());
        System.out.println(pizza.getDescription());
    }
}
