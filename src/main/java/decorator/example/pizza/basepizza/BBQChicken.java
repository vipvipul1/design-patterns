package decorator.example.pizza.basepizza;

import decorator.example.pizza.Pizza;

public class BBQChicken implements Pizza {
    private final String name = "BBQChicken";
    private final Integer cost = 200;

    @Override
    public Integer getCost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return name;
    }
}
