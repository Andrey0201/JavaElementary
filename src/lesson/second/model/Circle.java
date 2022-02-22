package lesson.second.model;

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

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }


    public  Point pointInCircle(Point point, Circle circle) {
        Point point1 = null;
        if (point.distance(circle) < r){
            point1 = point;
        }
        return  point1 ;
    }
//
//    public void foo(Point point,Circle circle){
//        System.out.println(point.distance(circle) < r ? point.getX() +"|" + point.getY() : "Outside");
//    }

    @Override
    public String toString() {
        return super.toString();
    }
}
