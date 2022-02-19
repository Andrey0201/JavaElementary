package lesson.second;

import java.util.ArrayList;
import java.util.Arrays;

public class PointList {
    public static void main(String[] args) {
        Point point = new Point();

        Circle  circle = new Circle();
        System.out.println(point.getCoordinate());
        System.out.println(circle.getPoint());



//





    }
}
//    // метод вычисляющий расстояние между точками
//    public double length(Point p) {
//        return Math.sqrt( Math.pow(p.x-x,2) + Math.pow(p.y-y,2) )

//    // метод проверяющий совпадают ли точки
//    public boolean equalsPoint(Point p) {
//        if(this.x == p.x && this.y == p.y) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public void quarter() {
//        if(x>0&&y>0) {
//            System.out.println("Point p2 is in first coordinate quarter");
//        } else if(x<0&&y>0) {
//            System.out.println("Point p2 is in second coordinate quarter");
//        } else if(x<0&&y<0) {
//            System.out.println("Point p2 is in third coordinate quarter");
//        } else {
//            System.out.println("Point p2 is in fourth coordinate quarter");
//        }
//    }

/*package ru.ismokejc;

import java.util.Scanner;

public class Cyber {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        new Cyber().foo();
    }

    public void foo() {
        Point circleCenter = getPoint("Input circle center:");
        double radius = userInput("Input radius: ");
        Point p = getPoint("Input point: ");
        System.out.println(p.distance(circleCenter) < radius ? "Inside" : "Outside");
    }

    Point getPoint(String msg) {
        System.out.println(msg);
        return new Point(userInput("X: "), userInput("Y: "));
    }

    double userInput(String msg) {
        System.out.print(msg);
        return scan.nextDouble();
    }
}

class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    double distance(Point p) {
        return Math.sqrt(Math.pow((p.x - x), 2) + Math.pow((p.y - y), 2));
    }*/