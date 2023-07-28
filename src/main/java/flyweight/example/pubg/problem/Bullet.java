package flyweight.example.pubg.problem;

public class Bullet {
    private String name;
    private double radius;
    private String color;
    private double weight;
    private String curCoordinate;   // coordinate represented by 3 directions = xi + yj + zk
    private String targetCoordinate;
    private String image;           // Generally of Blob data type holding bullet images of size >= 1kb

    public Bullet(String name, double radius, String color, double weight, String curCoordinate, String targetCoordinate, String image) {
        this.name = name;
        this.radius = radius;
        this.color = color;
        this.weight = weight;
        this.curCoordinate = curCoordinate;
        this.targetCoordinate = targetCoordinate;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCurCoordinate() {
        return curCoordinate;
    }

    public void setCurCoordinate(String curCoordinate) {
        this.curCoordinate = curCoordinate;
    }

    public String getTargetCoordinate() {
        return targetCoordinate;
    }

    public void setTargetCoordinate(String targetCoordinate) {
        this.targetCoordinate = targetCoordinate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void fire() {
        System.out.println("Firing bullet: " + this);
    }

    @Override
    public String toString() {
        return "Bullet{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", curCoordinate='" + curCoordinate + '\'' +
                ", targetCoordinate='" + targetCoordinate + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
