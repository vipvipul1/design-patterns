package decorator.example.icecream.cone;

import decorator.example.icecream.Icecream;

// This cone can work as a base/addon ice-cream both.
public class OrangeCone implements Icecream {
    private Icecream icecream;
    private int cost = 40;
    private String name = "OrangeCone";

    public OrangeCone() { }

    public OrangeCone(Icecream icecream) {
        this.icecream = icecream;
    }

    @Override
    public int getCost() {
        if (this.icecream != null)
            return this.icecream.getCost() + this.cost;
        return this.cost;
    }

    @Override
    public String getDescription() {
        if (this.icecream != null)
            return this.icecream.getDescription() + " + " + this.name;
        return this.name;
    }
}
