package lesson.second.controller;

import lesson.second.model.Circle;
import lesson.second.model.Point;
import lesson.second.model.PointList;

public class PointController {

    Point point;
    Circle circle;
    PointList pointList;

    public PointController(Point point, Circle circle, PointList pointList) {
        this.point = point;
        this.circle = circle;
        this.pointList = pointList;
    }

}

