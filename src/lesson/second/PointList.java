package lesson.second;

public class PointList {
    public static void main(String[] args) {

        Point point1 = new Point(0,0);
        System.out.println("Введите коордитаты точки");
        int x =point1.getPoint("x:");
        int y =point1.getPoint("y:");
        Point point2 = new Point(x,y);


        Circle circle =new Circle(0,0,0);
    }
}
