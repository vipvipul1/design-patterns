package strategy.example.maps.problem.v2;

public class Map {
    // All the algorithms for finding the shortest distance from src to dest via given mode.
    // Having all the algorithms in a single method makes it difficult to read, add new features and modify existing ones.
    // Also, any bug fix may lead to break of existing functionality. All these violate OCP (Open Closed Principle).
    // These algorithms(CarRoute/BikeRoute/WalkRoute) have no dependency on each other and are independent of each other.
    // Having all independent algorithms in a single method also breaks SRP (Single Responsibility Principle).
    public String getRoute(String src, String dest, String mode) {
        String shortestPath = "";
        if ("Car".equals(mode)) {
            // CarRoute shortest path algorithm.
            shortestPath = "Shortest distance from " + src + " to " + dest + " via Car route";
        } else if ("Bike".equals(mode)) {
            // BikeRoute shortest path algorithm.
            shortestPath = "Shortest distance from " + src + " to " + dest + " via Bike route";
        } else if ("Walk".equals(mode)) {
            // WalkRoute shortest path algorithm.
            shortestPath = "Shortest distance from " + src + " to " + dest + " via Walk route";
        }
        return shortestPath;
    }
}
