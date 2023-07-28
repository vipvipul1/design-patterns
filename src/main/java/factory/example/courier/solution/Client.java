package factory.example.courier.solution;

import factory.example.courier.solution.logistics.LogisticsFactory;
import factory.example.courier.solution.logistics.SeaLogistics;
import factory.example.courier.solution.transport.Transport;

public class Client {
    public static void main(String[] args) {
        // - Here we don't have direct dependency of delivery by truck via Road route only.
        // - If we want to add new route (Sea) by Ship, then we can just change the factory object RoadLogistics() to SeaLogistics()
        // and all other factory methods inside the SeaLogistics will be called with help of runtime polymorphism.
        LogisticsFactory logisticsFactory = new SeaLogistics();
//        LogisticsFactory logisticsFactory = new RoadLogistics();
        Transport transport = logisticsFactory.createTransport();
        transport.deliver();
    }
}
