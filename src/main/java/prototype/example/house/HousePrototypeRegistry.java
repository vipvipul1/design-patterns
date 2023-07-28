package prototype.example.house;

import java.util.HashMap;
import java.util.Map;

public class HousePrototypeRegistry {
    private Map<String, House> houseRegistry;

    public HousePrototypeRegistry() {
        houseRegistry = new HashMap<>();
    }

    public void register(String key, House house) {
        houseRegistry.put(key, house);
    }

    public House get(String key) {
        return houseRegistry.get(key);
    }
}
