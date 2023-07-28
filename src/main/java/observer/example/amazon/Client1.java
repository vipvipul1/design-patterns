package observer.example.amazon;

import observer.example.amazon.products.IPhone15;
import observer.example.amazon.publishers.EventManager;
import observer.example.amazon.subscribers.User;

// version1 - 1 product. Multiple users (only one Subscriber type - User). Multiple subscriptions on 1 product.
public class Client1 {
    public static void main(String[] args) {
        // initial config to mark 2 kinds of subscriptions for IPhone15 - launch, available.
        IPhone15 iPhone15 = new IPhone15();
        String[] events = { "launch", "available" };
        EventManager eventManager = new EventManager(events);
        iPhone15.setEventManager(eventManager);

        // user1, user2 want to subscribe to launch of IPhone15 only.
        // user2, user3 want to subscribe to stock availability of IPhone15 only.
        User user1 = new User(123, "User1", 7033341667L);
        User user2 = new User(456, "User2", 7778889990L);
        User user3 = new User(789, "User3", 222333444L);

        // setting the subscribers list for IPhone15
        iPhone15.getEventManager().subscribe("launch", user1);
        iPhone15.getEventManager().subscribe("launch", user2);
        iPhone15.getEventManager().subscribe("available", user2);
        iPhone15.getEventManager().subscribe("available", user3);

        // Launching IPhone15 now
        iPhone15.setLaunched(true);
        iPhone15.setStockCount(5);
    }
}
