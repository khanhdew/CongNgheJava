package Tuan4.Paint;

public class Point2D implements Shape {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double peri() {
        return 0;
    }

    @Override
    public double distance() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }

    @Override
    public double distance(Point2D p2) {
        return Math.sqrt(Math.pow(this.x - p2.x, 2) + Math.pow((this.y - p2.y),2));
    }

    @Override
    public void move(double dx, double dy, double dz) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void rotate(double alpha) {
        this.x = (this.x*Math.cos(alpha) - this.y*Math.sin(alpha));
        this.y = (this.x*Math.sin(alpha) + this.y*Math.cos(alpha));
    }

    @Override
    public void zoom(double ratio) {
        this.x *= ratio;
        this.y *= ratio;
    }

    public Point2D doiXung() {
        return new Point2D(-this.x, -this.y);
    }


}
