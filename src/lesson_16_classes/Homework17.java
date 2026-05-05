package lesson_16_classes;

import lesson_16_classes.animals.Drago2;

import java.util.Scanner;

public class Homework17 {

    public static void main(String[] args)  {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ім'я дракона: ");
        String name = scanner.nextLine();

        System.out.print("Введіть вік: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Введіть вагу: ");
        //int weight = scanner.nextInt();
        double weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Введіть колір: ");
        String color = scanner.nextLine();

        Drago2 dragon = new Drago2(name, age, weight, color);

        System.out.println("Створено дракона:");
        System.out.println(dragon);

        System.out.println("Дракон демонструє свої здібності:");
        dragon.speak();
        dragon.fire();

        scanner.close();
    }
}
