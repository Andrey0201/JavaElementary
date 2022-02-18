package lesson.second;


import java.util.ArrayList;
import java.util.Scanner;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;


    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getPoint(String pointCoordinate) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(pointCoordinate);
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число или не целое число!\n", str);
            System.out.print("Повторите ввод:\n" + pointCoordinate);
        }
        return scanner.nextInt();

    }


    public int getAnswer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Желаете добавить еще (1-да 2- нет)?");
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число или не целое число!\n", str);
            System.out.println("Повторите ввод (1-да 2- нет) ");
        }

        int number = scanner.nextInt();
        while (number < 1 || number > 2) {
            System.out.println("Неверное значение! Повторите ввод (1-да 2- нет)");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - не число или не целое число!\n", str);
                System.out.println("Повторите ввод (1-да 2- нет) ");
            }
            number = scanner.nextInt();
        }
        return number;
    }

}







