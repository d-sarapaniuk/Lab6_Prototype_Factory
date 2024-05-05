import java.awt.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
            Circle circle = new Circle(5, Color.BLUE);
            Circle deepCopyCircle = (Circle)circle.clone();
            Circle shallowCopyCircle = circle.copy();

            shallowCopyCircle.setColor(Color.PINK);
            deepCopyCircle.setColor(Color.RED);


            ShapeFactory factory = new ShapeFactory();
            Shape shape1 = factory.createShape(ShapeType.Triangle, Color.green);
            Shape shape2 = factory.createShape(ShapeType.Rectangle, Color.black);
            Shape shape3 = factory.createShape(ShapeType.Circle, Color.orange);
            shape1.display();
            shape2.display();
            shape3.display();

        }
}