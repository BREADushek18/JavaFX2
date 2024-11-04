package geometry2d;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class CircleShape extends Shape {
    private final double radius;

    public CircleShape(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw(GraphicsContext gc, double x, double y) {
        gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        gc.fillOval(x, y, radius, radius);
    }
}
