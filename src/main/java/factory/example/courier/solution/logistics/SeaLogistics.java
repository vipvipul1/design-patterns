package factory.example.courier.solution.logistics;

import factory.example.courier.solution.transport.Ship;
import factory.example.courier.solution.transport.Transport;

public class SeaLogistics implements LogisticsFactory {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
