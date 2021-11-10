package assignments.a3.shapes;

import javafx.scene.paint.Paint;

public class XCircle extends XShape {
    private double radius;
    public XCircle(double newLeft, double newTop, double newWidth, String shapeID, Paint color) {
        super(newLeft, newTop, newWidth, newWidth, shapeID, color);
        radius = newWidth / 2;
    }

    @Override
    public boolean contains(double x, double y) {
        return dist(x, y, this.drawingX, this.drawingY) < radius;
    }

    @Override
    public void move(double dX, double dY) {

    }
}
