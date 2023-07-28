package observer.example.amazon;

import observer.example.amazon.products.IPhone15;
import observer.example.amazon.products.MacBookM3;
import observer.example.amazon.publishers.EventManager;
import observer.example.amazon.subscribers.User;

// version2 - 2 products. Multiple users (only one Subscriber type - User). Multiple subscriptions on multiple products.
public class Client2 {
    public static void main(String[] args) {
        String[] events = { "launch", "available" };

        // initial config to mark 2 kinds of subscriptions for IPhone15, MacBookM3 - launch, available.
        IPhone15 iPhone15 = new IPhone15();
        EventManager iPhoneEventManager = new EventManager(events);
        iPhone15.setEventManager(iPhoneEventManager);

        MacBookM3 macBookM3 = new MacBookM3();
        EventManager macEventManager = new EventManager(events);
        macBookM3.setEventManager(macEventManager);

        // user1, user2 want to subscribe to launch of IPhone15 only.
        // user2, user3 want to subscribe to stock availability of IPhone15 only.
        // user1 wants to subscribe to launch of MacBookM3 only.
        // user3 wants to subscribe to stock availability of MacBookM3 only.
        User user1 = new User(123, "User1", 7033341667L);
        User user2 = new User(456, "User2", 7778889990L);
        User user3 = new User(789, "User3", 222333444L);

        // setting the subscribers list for IPhone15
        iPhone15.getEventManager().subscribe("launch", user1);
        iPhone15.getEventManager().subscribe("launch", user2);
        iPhone15.getEventManager().subscribe("available", user2);
        iPhone15.getEventManager().subscribe("available", user3);

        // setting the subscribers list for MacBookM3
        macBookM3.getEventManager().subscribe("launch", user1);
        macBookM3.getEventManager().subscribe("available", user3);

        // sometime later user1 decided to unsubscribe itself from IPhone15 launch.
        iPhone15.getEventManager().unSubscribe("launch", user1);

        // Launching IPhone15 now
        iPhone15.setLaunched(true);
        iPhone15.setStockCount(5);

        // launching MacBookM3 now
        macBookM3.setLaunched(true);
        macBookM3.setStockCount(10);
    }
}
