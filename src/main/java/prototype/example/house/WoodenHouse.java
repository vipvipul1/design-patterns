package prototype.example.house;

public class WoodenHouse extends House {
    int woods;

    public WoodenHouse() {}

    public WoodenHouse(WoodenHouse house) {
        super(house);
        this.woods = house.woods;
    }

    public int getWoods() {
        return woods;
    }

    public void setWoods(int woods) {
        this.woods = woods;
    }

    @Override
    public House clone() {
        WoodenHouse woodenHouse = new WoodenHouse(this);
        return woodenHouse;
    }
}
