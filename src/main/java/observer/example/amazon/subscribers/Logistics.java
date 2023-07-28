package observer.example.amazon.subscribers;

public class Logistics implements Subscriber {
    private int regId;
    private String name;
    private long helplineNo;
    private String email;

    public Logistics() { }

    public Logistics(int regId, String name, long helplineNo, String email) {
        this.regId = regId;
        this.name = name;
        this.helplineNo = helplineNo;
        this.email = email;
    }

    @Override
    public void update(String product, String eventType, Integer eventValue) {
        // update the Logistics team via email using this.email attribute of Logistics.
        if ("available".equals(eventType))
            System.out.println("Hey " + this.name + " Team! " + eventValue + " items of " + product + " are available in stock now. Get ready for the shipment!");
    }
}
