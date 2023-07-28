package factory.example.courier.problem.logistics;

import factory.example.courier.problem.transport.Truck;

public class RoadLogistics {
    public Truck createTransport() {
        return new Truck();
    }
}
