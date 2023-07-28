package decorator.example.pizza.addonpizza;

import decorator.example.pizza.Pizza;

public class Tomato implements Pizza {
    private final String name = "Tomato";
    private final Integer cost = 30;
    private final Pizza pizza;

    public Tomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public Integer getCost() {
        return this.pizza.getCost() + this.cost;
    }

    @Override
    public String getDescription() {
        return this.pizza.getDescription() + " + " + this.name;
    }
}
