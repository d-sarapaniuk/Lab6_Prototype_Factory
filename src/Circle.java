import java.awt.*;

public class Circle extends Shape implements Cloneable {
    private int radius = 1;

    public Circle(Color color){
        super(color);
    }
    public Circle (int r, Color c){
        radius = r;
        color = c;
    }
    public int getRadius() { return radius; }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void display() {
        System.out.println("Circle with radius " + radius + " and color" + String.format(" #%06X", color.hashCode() & 0xFFFFFF));
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
