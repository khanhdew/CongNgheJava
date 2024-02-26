package Tuan4.Example;

import Tuan4.Paint.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bai3 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int type = rand.nextInt(5);
            double randX = rand.nextDouble();
            double randY = rand.nextDouble();
            switch (type) {
                case 0:
                    shapes.add(new Point2D(randX, randY));
                    break;
                case 1:
                    shapes.add(new Circle(rand.nextDouble(),
                            new Point2D(rand.nextDouble(), rand.nextDouble())));
                    break;
                case 2:
                    shapes.add(new Line(new Point2D(rand.nextDouble(), rand.nextDouble()),
                            new Point2D(rand.nextDouble(), rand.nextDouble())));
                    break;
                case 3:
                    shapes.add(new Triangle(new Point2D(rand.nextDouble(), rand.nextDouble()),
                            new Point2D(rand.nextDouble(), rand.nextDouble()),
                            new Point2D(rand.nextDouble(), rand.nextDouble())));
                    break;
                case 4:
                    shapes.add(new Rectangle(new Point2D(rand.nextDouble(), rand.nextDouble()),
                            new Point2D(rand.nextDouble(), rand.nextDouble()),
                            new Point2D(rand.nextDouble(), rand.nextDouble()),
                            new Point2D(rand.nextDouble(), rand.nextDouble())));
                    break;
            }
        }
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
        double maxArea = -1, minArea = 99999;
        double sumArea = 0, sumPeri = 0;
        for (Shape shape : shapes) {
            if (!(shape instanceof Point2D) && !(shape instanceof Line)) {
                double area = shape.area();
                System.out.println("Dien tich hinh " + shape.getClass() + " = " +  String.format("%.4f",area));
                sumArea += area;
                sumPeri += shape.peri();
                if (maxArea < area)
                    maxArea = area;
                if (minArea > area)
                    minArea = area;
            }
        }
        System.out.println("Tong chu vi = " + String.format("%.4f",sumPeri));
        System.out.println("Tong dien tich = " + String.format("%.4f",sumArea));
        System.out.println("Dien tich lon nhat = " + String.format("%.4f",maxArea));
        System.out.println("Dien tich nho nhat = " + String.format("%.4f",minArea));

        Shape s1 = shapes.get(1);
        if (!(s1 instanceof Point2D)) {
            s1.zoom(1.83);
            System.out.println(s1.toString());
        }

    }
}
