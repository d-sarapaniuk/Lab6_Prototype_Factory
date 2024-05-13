import java.awt.*;

public class Rectangle extends Shape implements Cloneable {
    public Rectangle(Color color) {
        super(color);
    }
    public Object clone(){
        return new Rectangle(getColor());
    }
    public Rectangle copy() {
        return this;
    }
}
