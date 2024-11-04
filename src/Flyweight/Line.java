package Flyweight;

/**
 * The Line class represents a basic graphical primitive in a vector graphics editor.
 * It defines a line with a specific start and end point, along with a line type to manage memory efficiently.
 */
public class Line implements GraphicObject {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private LineType type;

    /**
     * The Line constructor initializes a line with specified coordinates and line type.
     * It sets up the line's start and end points for drawing.
     *
     * @param type The type of the line, defining color and thickness.
     * @param x1   The x-coordinate of the starting point.
     * @param y1   The y-coordinate of the starting point.
     * @param x2   The x-coordinate of the ending point.
     * @param y2   The y-coordinate of the ending point.
     */
    public Line(LineType type, int x1, int y1, int x2, int y2) {
        this.type = type;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    /**
     * The draw method renders the line on the screen.
     * It prints out the details of the line and its coordinates.
     */
    public void draw() {
        System.out.println("Drawing " + type.getDescription() + " from (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")");
    }
}
