package factory.example.courier.problem;

import factory.example.courier.problem.logistics.RoadLogistics;
import factory.example.courier.problem.transport.Truck;

public class Client {
    public static void main(String[] args) {
        // Here we have direct dependency of delivery by truck via Road route only.
        // If we want to add new route (Sea) route then we will have to replace all the methods dependent on the Road route.
        RoadLogistics roadLogistics = new RoadLogistics();
        Truck truck = roadLogistics.createTransport();
        truck.deliver();
    }
}
