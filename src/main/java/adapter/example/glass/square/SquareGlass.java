package adapter.example.glass.square;

/**
 * SquareGlasses are not compatible with RoundHoles (they were implemented by
 * previous development team). But we have to integrate them into our program.
 */
public class SquareGlass {
    private double width;

    public SquareGlass(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}
