package strategy.example.maps.solution.strategies;

public class WalkRouteStrategy implements RouteStrategy {
    @Override
    public String getRoute(String src, String dest) {
        // WalkRoute shortest path algorithm.
        return "Shortest distance from " + src + " to " + dest + " via Walk route";
    }
}
