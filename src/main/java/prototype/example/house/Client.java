package prototype.example.house;

public class Client {
    public static void main(String[] args) {
        HousePrototypeRegistry registry = new HousePrototypeRegistry();
        registerPrototypes(registry);

        // creating exact same copy of brickHouse as in the registry
        House house1 = registry.get("brickHouse").clone();

        House house2 = registry.get("woodenHouse").clone();

        System.out.println("DEBUG");
    }

    static void registerPrototypes(HousePrototypeRegistry registry) {
        BrickHouse brickHouse = new BrickHouse();
        brickHouse.setAddress("Bangalore, India");
        brickHouse.setFloors(2);
        brickHouse.setBricks(10000);
        brickHouse.setPillars(20);
        registry.register("brickHouse", brickHouse);

        WoodenHouse woodenHouse = new WoodenHouse();
        woodenHouse.setAddress("Jharkhand, India");
        woodenHouse.setFloors(1);
        woodenHouse.setWoods(100);
        registry.register("woodenHouse", woodenHouse);
    }
}

/*
1. Create an abstract class with few attributes and abstract clone() method.
   Return type of clone() method should be Parent type.
   Create a default and parameterized constructors.
   Parameterized constructor - so that the attributes can be initialized by the child object's parameterized constructor.
2. Create child classes extending above abstract class and overriding the clone() method.
   Create default and parameterized constructors.
   Parameterized constructor - so that parent class attributes can be initialized by this class parameterized constructor.
3. Each child class should override the clone() method by creating new object of it's class which calls
   it's parameterized constructor and then parent's parameterized constructor.
4. Create a PrototypeRegistry class with a Map<Key,Value> attribute. Key=String, Value=Parent class.
   It should have 2 methods to register a <Key,Value> pair and get the Value for any key.
5. Client should create a registerPrototype() method which will register different types of objects of Child classes.
6. Client can now have a main() method which will create copies of stored prototypes in the registry.
   Call the registry.get(key).clone() to create clone of Parent reference.
*/