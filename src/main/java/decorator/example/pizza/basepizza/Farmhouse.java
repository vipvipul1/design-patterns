package decorator.example.pizza.basepizza;

import decorator.example.pizza.Pizza;

public class Farmhouse implements Pizza {
    private final String name = "Farmhouse";
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
