package geometry2d;

import javafx.scene.canvas.GraphicsContext;

public abstract class Shape {
    public abstract void draw(GraphicsContext gc, double x, double y);
}
