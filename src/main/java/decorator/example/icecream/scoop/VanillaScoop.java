package decorator.example.icecream.scoop;

import decorator.example.icecream.Icecream;

// This cone can work as an addon ice-cream only.
public class VanillaScoop implements Icecream {
    private Icecream icecream;
    private int cost = 10;
    private String name = "VanillaScoop";

    public VanillaScoop(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        return this.icecream.getCost() + this.cost;
    }

    @Override
    public String getDescription() {
        return this.icecream.getDescription() + " + " + this.name;
    }
}
