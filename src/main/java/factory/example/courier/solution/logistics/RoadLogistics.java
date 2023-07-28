package factory.example.courier.solution.logistics;

import factory.example.courier.solution.transport.Transport;
import factory.example.courier.solution.transport.Truck;

public class RoadLogistics implements LogisticsFactory {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
