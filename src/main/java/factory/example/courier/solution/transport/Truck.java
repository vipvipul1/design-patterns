package factory.example.courier.solution.transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver cargo in Box by Truck via Road route");
    }
}
