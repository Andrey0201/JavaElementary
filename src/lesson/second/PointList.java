package lesson.second;

import java.util.ArrayList;
import java.util.Arrays;

public class PointList {
    public static void main(String[] args) {
        ArrayList<Point> coordinate = new ArrayList<>();
        Point point = new Point();
        System.out.println("Введите коордитаты точки");
        int x  = point.getPoint("x:");
        int y = point.getPoint("y:");
        coordinate.add(new Point(x,y));
        System.out.println(point.getX());





        Circle circle =new Circle(0,0,0);
    }
}
