package lesson.second;

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

    @Override
    public Point getPoint() {
        return super.getPoint();
    }

    @Override
    public ArrayList<Point> getCoordinate() {
        return super.getCoordinate();
    }

    @Override
    public int getX() {
        return super.getX();
    }

    @Override
    public void setX(int x) {
        super.setX(x);
    }

    @Override
    public int getY() {
        return super.getY();
    }

    @Override
    public void setY(int y) {
        super.setY(y);
    }

    @Override
    public int getPoint(String pointCoordinate) {
        return super.getPoint(pointCoordinate);
    }

    @Override
    public int getAnswer() {
        return super.getAnswer();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
