import java.awt.*;

public class Triangle extends Shape implements Cloneable {
    Triangle(Color color) {
        super(color);
    }
    public Object clone() {
        return new Triangle(this.color);
    }
    public Triangle copy() {
        return this;
    }
}
