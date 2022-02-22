package lesson.second.controller;

import lesson.second.model.Circle;
import lesson.second.model.Point;
import lesson.second.model.PointList;
import lesson.second.view.View;

import java.util.ArrayList;

public class PointController {

    Point point;
    Circle circle;
    PointList pointList;
    View view;

    public PointController() {

    }

    public PointController(Point point, Circle circle, PointList pointList, View view) {
        this.point = point;
        this.circle = circle;
        this.pointList = pointList;
        this.view = view;
    }

    public PointController(View view, PointList pointList) {
        this.pointList = pointList;
        this.view = view;
    }

    public void runApp() {
        ArrayList<Point> points = pointList.addPoints();
        Circle circle = view.getInputCircle();


    }

}

