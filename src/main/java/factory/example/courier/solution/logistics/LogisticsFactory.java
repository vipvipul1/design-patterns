package factory.example.courier.solution.logistics;

import factory.example.courier.solution.transport.Transport;

public interface LogisticsFactory {
    public Transport createTransport();

    // - The primary responsibility of LogisticsFactory isn't only to create objects via its child classes (SeaLogistics/RoadLogistics).
    // - LogisticsFactory can have its own concrete methods satisfying other business logic.
    // - Refer database package example for detailed explanation.
}
