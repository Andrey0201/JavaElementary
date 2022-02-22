package lesson.second.view;

import lesson.second.model.Circle;
import lesson.second.model.Point;
import lesson.second.units.Validator;

import java.util.Scanner;

public class View {

    int x;
    int y;
    int r;
    Scanner scanner;
    String title;
    String nameX;
    String nameY;
    Point point;
    int answer;
    Validator validator;

    Circle circle;

    public View() {

    }

    public View(Point point, Validator validator, Circle circle) {
        this.point = point;
        this.validator = validator;
        this.circle = circle;

    }

    public Circle getInputCircle() {
        Scanner scanner = new Scanner(System.in);
        title = "Введите коордитаты центра окружности";
        System.out.println(title);
        nameX = "x:";
        System.out.print(nameX);
        x = validator.validateInputPoints(scanner);
        circle.setX(x);
        nameY = "y:";
        System.out.print(nameY);
        y = validator.validateInputPoints(scanner);
        circle.setY(y);
        title = "Введите радиус окружности: ";
        System.out.println(title);
        r = validator.validateInputRadius(scanner);
        circle.setR(r);
        return new Circle(x,y);
    }

    public Point getNewPoint() {
        Scanner scanner = new Scanner(System.in);
        title = "Введите коордитаты точки";
        System.out.println(title);
        nameX = "x:";
        System.out.print(nameX);
        x = validator.validateInputPoints(scanner);
        point.setX(x);
        nameY = "y:";
        System.out.print(nameY);
        y = validator.validateInputPoints(scanner);
        point.setY(y);
        return  new Point(x,y);
    }

    public int getAnswer() {
        Scanner scanner = new Scanner(System.in);
        title = "Желаете добавить еще (1-да 2- нет)?";
        System.out.println(title);
        answer = validator.validateAnswer(scanner);
        return answer;
    }

    public void getOutput(String output) {
        System.out.println(output);
    }

}


