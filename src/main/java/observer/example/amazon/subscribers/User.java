package observer.example.amazon.subscribers;

public class User implements Subscriber {
    private int id;
    private String name;
    private long phone;

    public User() { }

    public User(int id, String name, long phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public void update(String product, String eventType, Integer eventValue) {
        // update the users via sms using this.phone attribute of User.
        if ("launch".equals(eventType))
            System.out.println("Hey " + this.name + "! " + product + " is now launched!");
        else if ("available".equals(eventType))
            System.out.println("Hey " + this.name + "! " + product + " is now in stock. Products available: " + eventValue + ". Hurry, order now!!");
    }
}
