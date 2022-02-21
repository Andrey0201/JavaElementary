package lesson.second;


import java.sql.SQLOutput;
import java.util.ArrayList;

public class Circle extends Point {

    private int r;

    public Circle() {

    }

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    public Circle(int x, int y) {
        super(x, y);
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    @Override
    public double distance(Point point) {
        return super.distance(point);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

//    @Override
//    public Point getPoint() {
//        System.out.println("Введите кординаты центра окружности ");
//        return new Circle(getPoints("x: "), getPoints("y: "));
//    }
//
//    public void foo() {
//        Point p = new Point().getPoint();
//        Point circleCenter = new Circle().getPoint();
//        double radius = 2;
//
//        System.out.println(p.distance(circleCenter) < radius ? p.getX() + p.getY() : "Outside");
//    }
//
//    @Override
//    double distance(Point p) {
//        return Math.sqrt(Math.pow((p.getX() - getX()), 2) + Math.pow((p.getY() - getY()), 2));
//    }
//
//    @Override
//    public String toString() {
//        return "Circle{" +
//                "coordinate=" + getCoordinate() +
//                "} " + super.toString();
//    }
//}