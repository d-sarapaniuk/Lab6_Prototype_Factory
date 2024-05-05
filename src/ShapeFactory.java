import java.awt.*;

/**
 * FACTORY PATTERN
 * Allows to create objects of Shape superclass
 * and define their class at runtime
 */

public class ShapeFactory {

    public Shape createShape(ShapeType shapeType, Color color) {
        return switch (shapeType) {
            case Circle -> new Circle(color);
            case Rectangle -> new Rectangle(color);
            case Triangle -> new Triangle(color);
            default -> null;
        };
    }
}
