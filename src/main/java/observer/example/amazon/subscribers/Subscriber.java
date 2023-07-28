package observer.example.amazon.subscribers;

public interface Subscriber {
    void update(String product, String eventType, Integer eventValue);
}
