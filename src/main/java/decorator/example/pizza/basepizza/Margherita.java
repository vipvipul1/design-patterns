package decorator.example.pizza.basepizza;

import decorator.example.pizza.Pizza;

public class Margherita implements Pizza {
    private final String name = "Margherita";
    private final Integer cost = 180;

    @Override
    public Integer getCost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return this.name;
    }
}
