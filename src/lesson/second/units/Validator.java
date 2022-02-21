package lesson.second.units;

import java.util.Scanner;

public class Validator {

    public Validator() {

    }

    public int validateInputPoints(Scanner scanner) {

        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число или не целое число!\n", str);
            System.out.print("Повторите ввод:\n");
        }
        return scanner.nextInt();

    }

    public int validateAnswer(Scanner scanner) {
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

    public int validateInputRadius(Scanner scanner) {

        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - не число или не целое число!\n", str);
            System.out.print("Повторите ввод:\n");
        }
        return scanner.nextInt();
    }
}
