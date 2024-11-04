package Flyweight;

/**
 * The LineType class defines the properties of a line, such as color and thickness.
 * It is used in the flyweight pattern to minimize memory usage by sharing common line attributes.
 */
public class LineType implements FlyweightObject {
    private String color;
    private int thickness;

    /**
     * The LineType constructor initializes the line type with specified color and thickness.
     *
     * @param color     The color of the line.
     * @param thickness The thickness of the line.
     */
    public LineType(String color, int thickness) {
        this.color = color;
        this.thickness = thickness;
    }

    @Override
    /**
     * The getDescription method returns a description of the line type.
     * It provides details about the line's color and thickness.
     *
     * @return A string describing the line type.
     */
    public String getDescription() {
        return "a line with color: " + color + ", thickness: " + thickness;
    }
}
