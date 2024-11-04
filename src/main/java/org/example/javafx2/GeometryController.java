package org.example.javafx2;

import geometry2d.CircleShape;
import geometry2d.RectangleShape;
import geometry2d.Shape;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;

import java.util.Random;

public class GeometryController {

    @FXML
    private Canvas canvas;

    @FXML
    private Button circleButton;

    @FXML
    private Button rectangleButton;

    private final Random random = new Random();

    @FXML
    public void initialize() {
        circleButton.setOnAction(e -> drawShape(new CircleShape(random.nextDouble() * 50 + 10)));
        rectangleButton.setOnAction(e -> drawShape(new RectangleShape(random.nextDouble() * 50 + 10, random.nextDouble() * 50 + 10)));
    }

    private void drawShape(Shape shape) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        double x = random.nextDouble() * (canvas.getWidth() - 50);
        double y = random.nextDouble() * (canvas.getHeight() - 50);
        shape.draw(gc, x, y);
    }
}
