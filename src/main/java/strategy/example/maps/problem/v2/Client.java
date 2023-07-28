package strategy.example.maps.problem.v2;

public class Client {
    public static void main(String[] args) {
        // 1st version (v1) was loved by millions, so users demanded for Bike, Cycle & Walking routes as well.
        Map map = new Map();
        String shortedPathCar = map.getRoute("Bangalore", "Hyderabad", "Car");
        System.out.println(shortedPathCar);

        String shortedPathBike = map.getRoute("Ejipura", "Indranagar", "Bike");
        System.out.println(shortedPathBike);

        String shortedPathWalk = map.getRoute("Domlur", "Ejipura", "Walk");
        System.out.println(shortedPathWalk);
    }
}
