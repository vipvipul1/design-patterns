package strategy.example.maps.solution.strategies;

public class BikeRouteStrategy implements RouteStrategy {
    @Override
    public String getRoute(String src, String dest) {
        // BikeRoute shortest path algorithm.
        return  "Shortest distance from " + src + " to " + dest + " via Bike route";
    }
}
