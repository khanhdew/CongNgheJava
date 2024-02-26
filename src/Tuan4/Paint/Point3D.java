package Tuan4.Paint;

public class Point3D extends Point2D {
    private double z;

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + this.getX() +
                ", y=" + this.getY() +
                ", z=" + z +
                '}';
    }

    @Override
    public double distance() {
        return Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY() + this.z * this.z);
    }

    @Override
    public double distance(Point2D p2) {
        if (p2 instanceof Point3D) {
            return Math.sqrt(Math.pow(this.getX() - p2.getX(), 2) + Math.pow(this.getY() - p2.getY(), 2) + Math.pow(this.z - ((Point3D) p2).z, 2));
        }
        return 0;
    }

    @Override
    public Point2D doiXung() {
        return new Point3D(-this.getX(), -this.getY(), -this.z);
    }

    @Override
    public void move(double dx, double dy, double dz) {
        this.setX(this.getX() + dx);
        this.setY(this.getY() + dy);
        this.setZ(this.getZ() + dz);
    }

}
