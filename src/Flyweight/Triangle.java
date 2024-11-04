package Flyweight;

import java.util.ArrayList;
import java.util.List;

/**
 * The Triangle class represents a composite graphical object in a vector graphics editor.
 * It is formed by three lines and uses flyweight pattern to optimize memory usage.
 */
public class Triangle implements GraphicObject {
    private List<Line> lines = new ArrayList<>();

    /**
     * The Triangle constructor creates a composite shape using multiple lines.
     * It ensures that the lines share common properties using the flyweight pattern.
     *
     * @param color     The color of the triangle's lines.
     * @param thickness The thickness of the triangle's lines.
     * @param x1        The x-coordinate of the first vertex.
     * @param y1        The y-coordinate of the first vertex.
     * @param x2        The x-coordinate of the second vertex.
     * @param y2        The y-coordinate of the second vertex.
     * @param x3        The x-coordinate of the third vertex.
     * @param y3        The y-coordinate of the third vertex.
     */
    public Triangle(String color, int thickness, int x1, int y1, int x2, int y2, int x3, int y3) {
        LineType lineType = LineFactory.getLineType(color, thickness);
        lines.add(new Line(lineType, x1, y1, x2, y2));
        lines.add(new Line(lineType, x2, y2, x3, y3));
        lines.add(new Line(lineType, x3, y3, x1, y1));
    }

    @Override
    /**
     * The draw method renders the triangle on the screen.
     * It draws each line that forms the triangle.
     */
    public void draw() {
        for (Line line : lines) {
            line.draw();
        }
    }
}
