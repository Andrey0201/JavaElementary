package lesson.second;

import java.util.Scanner;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;


    }


    public int getPoint(String pointCoordinate) {
        Scanner scanner = new Scanner(System.in);
        int point;
        while (true) {
            System.out.print(pointCoordinate);
            if (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не целое число, повторите ввод");
                scanner.next();
            } else {
                point = scanner.nextInt();
                return point;
            }

        }
    }
}


