package decorator.example.pizza.addonpizza;

import decorator.example.pizza.Pizza;

public class Olive implements Pizza {
    private final String name = "Olive";
    private final Integer cost = 20;
    private final Pizza pizza;

    public Olive(Pizza pizza) {
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
