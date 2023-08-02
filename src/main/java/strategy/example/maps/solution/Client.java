package strategy.example.maps.solution;

import strategy.example.maps.solution.map.Map;
import strategy.example.maps.solution.strategies.BikeRouteStrategy;
import strategy.example.maps.solution.strategies.CarRouteStrategy;
import strategy.example.maps.solution.strategies.RouteStrategy;
import strategy.example.maps.solution.strategies.WalkRouteStrategy;

public class Client {
    public static void main(String[] args) {
        // 1st version (v1) was loved by millions, so users demanded for Bike, Cycle & Walking routes as well.
        // take src, dest and mode as input from user
        String src = "Bangalore", dest = "Hyderabad";
        String mode = "Car";
//        String mode = "Bike";
//        String mode = "Walk";

        RouteStrategy routeStrategy = getRouteStrategy(mode);
        Map map = new Map(routeStrategy);
        String shortedPath = map.getShortestPath(src, dest);
        System.out.println(shortedPath);
    }

    private static RouteStrategy getRouteStrategy(String mode) {
        if ("Bike".equals(mode)) {
            return new BikeRouteStrategy();
        }
        if ("Walk".equals(mode)) {
            return new WalkRouteStrategy();
        }
        return new CarRouteStrategy();  // default mode
    }
}
