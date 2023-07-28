package strategy.example.maps.solution.map;

import strategy.example.maps.solution.strategies.RouteStrategy;

public class Map {
    private RouteStrategy routeStrategy;

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public String getShortestPath(String src, String dest) {
        return routeStrategy.getRoute(src, dest);
    }
}
