package Tuan4.Example;

import Tuan4.Paint.Point2D;
import Tuan4.Paint.Point3D;

import java.util.ArrayList;
import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(1,1);
        Point2D p2 = new Point2D(2,3);
        Point3D p3 = new Point3D(1,1,4);
        Point3D p4 = new Point3D(1,2,4);

        List<Point2D> lPoints = new ArrayList<>();
        lPoints.add(p1);
        lPoints.add(p2);
        lPoints.add(p3);
        lPoints.add(p4);
        List<Point2D> lPointsDX = new ArrayList<>();
        for(Point2D p:lPoints) {
            System.out.println(p.toString());
            lPointsDX.add(p.doiXung());
        }

        System.out.println("Diem doi xung");

        for(Point2D p:lPointsDX) {
            System.out.println(p.toString());
        }
    }
}
