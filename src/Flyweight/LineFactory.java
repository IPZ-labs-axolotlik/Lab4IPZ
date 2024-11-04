package Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * The LineFactory class is a factory for creating and managing line types.
 * It uses a flyweight pattern to ensure memory efficiency when working with numerous line objects.
 */
public class LineFactory {
    private static Map<String, FlyweightObject> lineTypes = new HashMap<>();

    /**
     * The getLineType method retrieves or creates a line type based on color and thickness.
     * It ensures that common line properties are shared to optimize memory usage.
     *
     * @param color     The color of the line.
     * @param thickness The thickness of the line.
     * @return The LineType object with the specified properties.
     */
    public static LineType getLineType(String color, int thickness) {
        String key = color + thickness;
        if (!lineTypes.containsKey(key)) {
            lineTypes.put(key, new LineType(color, thickness));
        }
        return (LineType) lineTypes.get(key);
    }
}
