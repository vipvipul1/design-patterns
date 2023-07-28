package decorator.example.icecream.syrup;

import decorator.example.icecream.Icecream;

// This cone can work as an addon ice-cream only.
public class ChocoSyrup implements Icecream {
    private Icecream icecream;
    private int cost = 15;
    private String name = "ChocoSyrup";

    public ChocoSyrup(Icecream icecream) {
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
