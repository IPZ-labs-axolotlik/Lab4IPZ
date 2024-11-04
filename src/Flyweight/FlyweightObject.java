package Flyweight;

/**
 * The FlyweightObject interface defines the contract for graphical objects in the vector graphics editor.
 * It includes methods for drawing and describing the graphical objects.
 */
public interface FlyweightObject {
    /**
     * The getDescription method returns a description of the graphical object.
     * It provides details specific to the implementation of the object.
     */
    String getDescription();
}
