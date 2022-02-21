package lesson.second;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Point>points = new ArrayList<>();
        Point point = new Point();
        Circle circle = new Circle();
        Validator validator = new Validator();
        View view = new View(point,validator,circle);
        PointList pointList = new PointList(points,view);

        System.out.println(pointList.addPoints());
    }
}
