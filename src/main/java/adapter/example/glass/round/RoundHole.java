package adapter.example.glass.round;

/**
 * RoundHoles are compatible with RoundGlasses.
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundGlass glass) {
        return this.getRadius() >= glass.getRadius();
    }
}
