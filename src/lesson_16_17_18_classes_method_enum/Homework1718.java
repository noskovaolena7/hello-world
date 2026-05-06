package lesson_16_17_18_classes_method_enum;

import lesson_16_17_18_classes_method_enum.animals.Drago2;
import lesson_16_17_18_classes_method_enum.animals.Drago2Breed;

import java.util.Scanner;

public class Homework1718 {

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

        System.out.println("Оберіть породу дракона:");
        for (Drago2Breed b : Drago2Breed.values()) {
            System.out.println("- " + b);
        }

        System.out.print("Введіть породу: ");
        String breedInput = scanner.nextLine().toUpperCase();

        Drago2Breed breed = Drago2Breed.valueOf(breedInput);

        Drago2 dragon = new Drago2(name, age, weight, color, breed);

        String breedString= breed.name();

        System.out.println("Створено дракона:");
        System.out.println(dragon);

        System.out.println("Дракон демонструє свої здібності:");
        dragon.speak();
        dragon.fire();

        scanner.close();
    }
}
