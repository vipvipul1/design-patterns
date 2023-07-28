package prototype.example.house;

abstract public class House {
    private String address;
    private int floors;

    public House() {}

    public House(House house) {
        this.address = house.address;
        this.floors = house.floors;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    abstract public House clone();
}
