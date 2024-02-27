package Tuan4.Example;

import Tuan4.Paint.Point2D;
import Tuan4.Paint.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1, 1);
        Point2D p2 = new Point2D(2, 3);
        Point3D p3 = new Point3D(1, 1, 4);
        Point3D p4 = new Point3D(1, 2, 4);

        List<Point2D> lPoints = new ArrayList<>();
        lPoints.add(p1);
        lPoints.add(p2);
        lPoints.add(p3);
        lPoints.add(p4);
        List<Point2D> lPointsDX = new ArrayList<>();
        for (Point2D p : lPoints) {
            System.out.println(p.toString());
            lPointsDX.add(p.doiXung());
        }

        final var result = getResult(lPoints);
        System.out.println("Nho nhat = " + result.min() + " la : " + result.pp().toString());
        System.out.println("Diem doi xung");

        for (Point2D p : lPointsDX) {
            System.out.println(p.toString());
        }
    }

    private static Result getResult(List<Point2D> lPoints) {
        double min = 9999;
        Point2D pp = null;
        for (Point2D p : lPoints) {
            if (!(p instanceof Point3D)) {
                double d = p.distance(new Point2D(0, 0));
                if (min > d) {
                    min = d;
                    pp = p;
                }
            }
        }
        Result result = new Result(min, pp);
        return result;
    }

    private record Result(double min, Point2D pp) {
    }
}
