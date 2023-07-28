package factory.example.courier.solution.transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver cargo in Container by Ship via Sea route");
    }
}
