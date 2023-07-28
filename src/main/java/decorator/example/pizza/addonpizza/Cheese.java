package decorator.example.pizza.addonpizza;

import decorator.example.pizza.Pizza;

public class Cheese implements Pizza {
    private final String name = "Cheese";
    private final Integer cost = 80;
    private final Pizza pizza;

    public Cheese(Pizza pizza) {
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
