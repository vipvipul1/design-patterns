package adapter.example.glass.adapters;

import adapter.example.glass.round.RoundGlass;
import adapter.example.glass.square.SquareGlass;

/**
 * Adapter allows fitting square glasses into round holes.
 */
public class SquareGlassAdapter extends RoundGlass {
    private SquareGlass glass;

    public SquareGlassAdapter(SquareGlass glass) {
        this.glass = glass;
    }

    @Override
    public double getRadius() {
        double result;
        // Calculate a minimum circle radius, which can fit this glass.
        result = (Math.sqrt(Math.pow((glass.getWidth() / 2), 2) * 2));
        return result;
    }
}
