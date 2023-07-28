package observer.example.amazon.publishers;

import observer.example.amazon.subscribers.Subscriber;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EventManager {
    // - We aren't hard coupling User class in subscribers list.
    // - Instead, using Subscriber interface so that if later new Subscriber (WholeSellers, Logistics etc.) comes
    // then they can simply implement the Subscriber interface and existing code would work fine.
    private Map<String, Set<Subscriber>> subscribers;   // - "launch" -> user1, user2 | "available" -> user2, user3

    public EventManager(String[] events) {
        subscribers = new HashMap<>();
        for (String event: events)
            subscribers.put(event, new HashSet<>());
    }

    // called by a product for each user to subscribe to the eventType - launch/isAvailable
    public void subscribe(String eventType, Subscriber user) {
        if (subscribers.get(eventType) != null)
            subscribers.get(eventType).add(user);
        else
            System.out.println("No subscription type: " + eventType + " found for this product.");
    }

    // called by a product for each user to unsubscribe to the eventType - launch/isAvailable
    public void unSubscribe(String eventType, Subscriber user) {
        if (subscribers.get(eventType) != null)
            subscribers.get(eventType).remove(user);
        else
            System.out.println("No subscription type: " + eventType + " found for this product.");
    }

    public void notify(String product, String eventType, Integer eventValue) {
        for (Subscriber subscriber: subscribers.get(eventType)) {
            subscriber.update(product, eventType, eventValue);
        }
    }
}
