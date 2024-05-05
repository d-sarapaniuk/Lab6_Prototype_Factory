import java.awt.*;

public class Client {
    public static void main(String[] args) {
            Circle circle = new Circle(5, Color.BLUE);
            Circle deepCopyCircle = (Circle)circle.clone();
            Circle shallowCopyCircle = circle.copy();

            shallowCopyCircle.setColor(Color.PINK);
            deepCopyCircle.setColor(Color.RED);

        }
}