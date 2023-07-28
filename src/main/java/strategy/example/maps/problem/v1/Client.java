package strategy.example.maps.problem.v1;

public class Client {
    public static void main(String[] args) {
        // 1st version of Maps App initially designed for Car routes only.
        Map map = new Map();
        String shortedPath = map.getRoute("Bangalore", "Hyderabad");
        System.out.println(shortedPath);
    }
}
