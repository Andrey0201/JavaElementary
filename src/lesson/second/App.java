package lesson.second;

import lesson.second.model.Circle;
import lesson.second.model.Point;
import lesson.second.model.PointList;
import lesson.second.units.Validator;
import lesson.second.view.View;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
        Point point = new Point();
        Circle circle = new Circle();
        Validator validator = new Validator();
        View view = new View(point, validator, circle);
        PointList pointList = new PointList(points, view);
        pointList.addPoints();
        view.getInputCircle();
        System.out.println (points.get(0).distance(circle));



    }
}
