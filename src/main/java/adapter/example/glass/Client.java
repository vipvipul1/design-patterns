package adapter.example.glass;

import adapter.example.glass.adapters.SquareGlassAdapter;
import adapter.example.glass.round.RoundHole;
import adapter.example.glass.round.RoundGlass;
import adapter.example.glass.square.SquareGlass;

/**
 * Somewhere in client code...
 */
public class Client {
    public static void main(String[] args) {
        // Round fits round, no surprise.
        RoundHole hole = new RoundHole(5);
        RoundGlass rglass = new RoundGlass(5);
        if (hole.fits(rglass)) {
            System.out.println("Round glass r5 fits round hole r5.");
        }

        SquareGlass smallSqGlass = new SquareGlass(2);
        SquareGlass largeSqGlass = new SquareGlass(20);
        // hole.fits(smallSqGlass); // Won't compile.

        // Adapter solves the problem.
        SquareGlassAdapter smallSqGlassAdapter = new SquareGlassAdapter(smallSqGlass);
        SquareGlassAdapter largeSqGlassAdapter = new SquareGlassAdapter(largeSqGlass);
        if (hole.fits(smallSqGlassAdapter)) {
            System.out.println("Square glass w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqGlassAdapter)) {
            System.out.println("Square glass w20 does not fit into round hole r5.");
        }
    }
}
