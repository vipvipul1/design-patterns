package prototype.example.house;

public class BrickHouse extends House {
    private int bricks;
    private int pillars;

    public BrickHouse() { }

    public BrickHouse(BrickHouse house) {
        super(house);
        this.bricks = house.bricks;
        this.pillars = house.pillars;
    }

    public int getBricks() {
        return bricks;
    }

    public void setBricks(int bricks) {
        this.bricks = bricks;
    }

    public int getPillars() {
        return pillars;
    }

    public void setPillars(int pillars) {
        this.pillars = pillars;
    }

    @Override
    public House clone() {
        BrickHouse brickHouse = new BrickHouse(this);
        return brickHouse;
    }
}
