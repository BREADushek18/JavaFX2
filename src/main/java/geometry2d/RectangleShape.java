package geometry2d;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class RectangleShape extends Shape {
    private final double width;
    private final double height;

    public RectangleShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(GraphicsContext gc, double x, double y) {
        gc.setFill(Color.color(Math.random(), Math.random(), Math.random()));
        gc.fillRect(x, y, width, height);
    }
}
