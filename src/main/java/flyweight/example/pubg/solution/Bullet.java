package flyweight.example.pubg.solution;

import java.util.HashMap;
import java.util.Map;

// This is a flyweight class. Object of this type is very heavy and very few of these object types are created.
public class Bullet {
    // intrinsic attributes
    private final String name;
    private final double radius;
    private final String color;
    private final double weight;
    private final String image;           // Generally of Blob data type holding bullet images of size >= 1kb

    // stores all unique Bullet types.
    private static final Map<String, Bullet> bulletTypes = new HashMap<>();

    public Bullet(String name, double radius, String color, double weight, String image) {
        this.name = name;
        this.radius = radius;
        this.color = color;
        this.weight = weight;
        this.image = image;
    }

    // setters shouldn't be there in flyweight Bullet so that once initialized via constructor they can't be modified.
    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public String getImage() {
        return image;
    }

    public static Bullet getBullet(String name, double radius, String color, double weight, String image) {
        if (bulletTypes.containsKey(name))
            return bulletTypes.get(name);
        Bullet bullet = new Bullet(name, radius, color, weight, image);
        bulletTypes.put(name, bullet);

        System.out.println("Current Unique Bullet Types: " + bulletTypes.size());
        return bullet;
    }

    @Override
    public String toString() {
        return "Bullet{" +
                "name='" + name + '\'' +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", image='" + image + '\'' +
                '}';
    }
}
