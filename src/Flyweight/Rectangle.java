package Flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * The Rectangle class represents a composite graphical object in a vector graphics editor.
 * It is composed of four lines forming a rectangle and uses flyweight pattern to optimize memory usage.
 */
public class Rectangle implements GraphicObject {
    private List<Line> lines = new ArrayList<>();

    /**
     * The Rectangle constructor creates a composite shape using multiple lines.
     * It ensures that the lines share common properties using the flyweight pattern.
     *
     * @param color     The color of the rectangle's lines.
     * @param thickness The thickness of the rectangle's lines.
     * @param x1        The x-coordinate of the top-left corner.
     * @param y1        The y-coordinate of the top-left corner.
     * @param width     The width of the rectangle.
     * @param height    The height of the rectangle.
     */
    public Rectangle(String color, int thickness, int x1, int y1, int width, int height) {
        lines.add(new Line(color, thickness, x1, y1, x1 + width, y1));
        lines.add(new Line(color, thickness, x1 + width, y1, x1 + width, y1 + height));
        lines.add(new Line(color, thickness, x1 + width, y1 + height, x1, y1 + height));
        lines.add(new Line(color, thickness, x1, y1 + height, x1, y1));
    }

    @Override
    /**
     * The draw method renders the rectangle on the screen.
     * It draws each line that forms the rectangle.
     */
    public void draw() {
        for (Line line : lines) {
            line.draw();
        }
    }
}
