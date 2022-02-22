package lesson.second.controller;


import lesson.second.model.Circle;
import lesson.second.model.Point;
import lesson.second.model.PointList;
import lesson.second.view.View;

import java.util.ArrayList;

public class PointController {

    PointList pointList;
    View view;



    public PointController(View view, PointList pointList) {
        this.pointList = pointList;
        this.view = view;
    }

    public void runApp() {
      ArrayList<Point> points = pointList.addPoints();
      Circle circle = view.getInputCircle();
      ArrayList<Point> points1 = pointList.addNewPoints();

        String output = "Все заданые точки координат: " + points +
                "\nКоординаты окружности: " + circle +
                "\nВсе точки которые пренадлежат окружности: " + points1;
        view.getOutput(output);
    }

}

