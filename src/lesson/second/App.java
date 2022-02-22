package lesson.second;

import lesson.second.controller.PointController;
import lesson.second.model.Circle;
import lesson.second.model.Point;
import lesson.second.model.PointList;
import lesson.second.units.Validator;
import lesson.second.view.View;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<>();
       Point point = new Point();
       Validator validator = new Validator();
       Circle circle = new Circle();
        View view = new View(point, validator, circle);
       PointList pointList = new PointList(points, view,circle);



        pointList.addPoints();
        view.getInputCircle();
        System.out.println(points.get(1).distance(circle));
        System.out.println(circle);
        System.out.println(pointList);

        System.out.println(pointList.addNewPoints(circle));

//        System.out.println(circle.pointInCircle(points.get(1),circle));

//        PointController pointController = new PointController(view,pointList);
//        pointController.runApp();


    }
}
