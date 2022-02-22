package lesson.second.model;

import lesson.second.view.View;

import java.util.ArrayList;

public class PointList {

    private ArrayList<Point> points = new ArrayList<>();
    View view;
    Circle circle;

    public PointList() {

    }

    public PointList(View view) {
        this.view = view;

    }

    public PointList(Circle circle) {
        this.circle = circle;
    }

    public PointList(ArrayList<Point> points, View view,Circle circle) {
        this.points = points;
        this.view = view;
        this.circle = circle;
    }

    public PointList(ArrayList<Point> points) {
        this.points = points;
    }

    public ArrayList<Point> getPoints() {
        return points;
    }

    public void setPoints(ArrayList<Point> points) {
        this.points = points;
    }


    public ArrayList<Point> addPoints() {
        points.add(view.getNewPoint());
        while (view.getAnswer() == 1) {
            points.add(view.getNewPoint());
        }
        return points;
    }

    public ArrayList<Point> addNewPoints(Circle circle) {
        ArrayList<Point>points1 = new ArrayList<Point>();
        for ( Point i:points) {
         if(circle.pointInCircle(i,circle) !=null){
             points1.add(circle.pointInCircle(i,circle));
         }
            points =points1;
        }

        return points;
    }

    @Override
    public String toString() {
        return "PointList{" +
                "points=" + points +
                '}';
    }
}

