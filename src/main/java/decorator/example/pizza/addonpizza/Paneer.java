package decorator.example.pizza.addonpizza;

import decorator.example.pizza.Pizza;

public class Paneer implements Pizza {
    private final String name = "Paneer";
    private final Integer cost = 60;
    private final Pizza pizza;

    public Paneer(Pizza pizza) {
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
