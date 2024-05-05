import java.awt.*;

public class Circle implements Shape, Cloneable {
    private int radius;
    private Color color;
    Circle(int r, Color c) {
        radius = r;
        color = c;
    }
    public int getRadius() { return radius; }
    public Color getColor() { return color; }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public void display() {
        System.out.println("Circle with radius " + radius + " and color " + color);
    }

    /**
     * Deep copying
     * @return a new Circle object with the same field values as in THIS;
     * new memory allocation happens
     */

    public Object clone() {
        return new Circle(this.radius, this.color);
    }

    /**
     * Shallow copying
     * @return a reference to the same memory location as of this Circle
     */

    public Circle copy() {
        return this;
    }

}
