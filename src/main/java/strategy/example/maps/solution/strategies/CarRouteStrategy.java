package strategy.example.maps.solution.strategies;

public class CarRouteStrategy implements RouteStrategy {
    @Override
    public String getRoute(String src, String dest) {
        // CarRoute shortest path algorithm.
        return  "Shortest distance from " + src + " to " + dest + " via Car route";
    }
}
