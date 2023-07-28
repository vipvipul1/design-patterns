package decorator.example.icecream.cone;

import decorator.example.icecream.Icecream;

// This cone can work as a base ice-cream only.
public class LichiCone implements Icecream {
    private int cost = 60;
    private String name = "LichiCone";

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public String getDescription() {
        return this.name;
    }
}
