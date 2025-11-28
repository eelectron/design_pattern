package org.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarModelFactory {
    private static final Map<String, CarModel> carModels = new HashMap<>();

    public static CarModel getCarModel(String brand, String engine, String color) {
        String key = brand + "-" + engine + "-" + color;
        if (!carModels.containsKey(key)) {
            carModels.put(key, new CarModel(brand, engine, color));
        }
        return carModels.get(key);
    }
}
