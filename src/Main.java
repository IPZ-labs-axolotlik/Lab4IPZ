import Flyweight.GraphicObject;
import Flyweight.Rectangle;
import Flyweight.Triangle;

/**
 * The Main class demonstrates the creation and drawing of graphical objects.
 * It initializes and draws different shapes using a vector graphics editor simulation.
 */
public class Main {
    /**
     * The main method is the entry point of the application.
     * It demonstrates the creation and drawing of various graphical objects using the flyweight pattern.
     */
    public static void main(String[] args) {
        GraphicObject[] graphicObjects = {
                new Rectangle("red", 2, 10, 10, 30, 20),
                new Rectangle("green", 4, 15, 10, 25, 20),
                new Triangle("red", 2, 2, 4, 4, 5, 2, 3)
        };
        for (GraphicObject object : graphicObjects) {
            object.draw();
            System.out.println();
        }
    }
}