import java.awt.*;

public abstract class Shape {
    Color color;
    public Shape(Color color){
        this.color = color;
    }
    public Shape(){};
    public Color getColor() { return color; }
    public void setColor(Color color) {
        this.color = color;
    }
    public void display(){
        System.out.println(this.getClass().getSimpleName() + " of color" + String.format(" #%06X", color.hashCode() & 0xFFFFFF));
    };

}
