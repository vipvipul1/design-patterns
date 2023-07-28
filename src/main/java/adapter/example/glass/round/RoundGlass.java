package adapter.example.glass.round;

/**
 * RoundGlasses are compatible with RoundHoles.
 */
public class RoundGlass {
    private double radius;

    public RoundGlass() {}

    public RoundGlass(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
