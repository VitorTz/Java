import java.awt.*;
import java.awt.geom.Rectangle2D;

class Rect {

    private final double x, width, height;
    private final Color color;
    private double y;

    public Rect(double x ,double y) {
        this(x, y, Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.RECT_COLOR);
    }

    public Rect(double x, double y, double width, double height, Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public void moveRect(double y){
        this.y += y;
    }

    public double getX() {
        return x;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Color getColor() {
        return color;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getLeft(){
        return this.x;
    }

    public double getRight(){
        return this.x + this.width;
    }

    public double getTop(){
        return this.y;
    }

    public double getBottom(){
        return this.y + this.height;
    }

}
