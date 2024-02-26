package Tuan4.Paint;

public class Circle implements Shape {
    private double R;
    private Point2D Center;

    public Circle(double r, Point2D center) {
        R = r;
        this.Center =center;
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    public Point2D getCenter() {
        return Center;
    }

    public void setCenter(Point2D center) {
        Center = center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "R=" + R +
                ", Center=" + Center +
                '}';
    }

    @Override
    public double area() {
        return this.R * this.R * Math.PI;
    }

    @Override
    public double peri() {
        return 2 * R * Math.PI;
    }

    @Override
    public double distance() {
        return 0;
    }

    @Override
    public double distance(Point2D p2) {
        return this.Center.distance(p2);
    }

    @Override
    public void move(double cX, double cY, double dz) {
        this.Center.move(cX, cY, dz);
    }

    @Override
    public void rotate(double alpha) {
    }

    @Override
    public void zoom(double ratio) {
        this.R *= ratio;
    }
}
