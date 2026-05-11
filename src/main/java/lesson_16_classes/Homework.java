package lesson_16_classes;

import lesson_16_classes.animals.Dragon;

import java.util.Scanner;

public class Homework {

    static void main() {

        Dragon luna = new Dragon();
        luna.setName("Луна");
        luna.setAge(7);
        luna.setWeight(15.5);
        luna.setColor("Бiлий");

        System.out.println("Дракончика звати: " + luna.getName());
        System.out.println("Вік дракончика: " + luna.getAge());
        System.out.println("Вага дракончика: " + luna.getWeight());
        System.out.println("Колiр дракончика: " + luna.getColor());

        Dragon sun = new Dragon("Сонце", 13, 27.7, "Жовтий");

        System.out.println("Дракончика звати: " + sun.getName());
        System.out.println("Вік дракончика: " + sun.getAge());
        System.out.println("Вага дракончика: " + sun.getWeight());
        System.out.println("Колiр дракончика: " + sun.getColor());


        // Створення 3 драконів з клавіатури
        Dragon[] dragons = new Dragon[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

        System.out.println("Створення дракона №" + (i + 1));

        System.out.print("Введіть ім'я: ");
        String name = scanner.nextLine();

        System.out.print("Введіть вік: ");
        int age = scanner.nextInt();

        System.out.print("Введіть вагу: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Введіть колір: ");
        String color = scanner.nextLine();

        // створюємо дракона
        dragons[i] = new Dragon(name, age, weight, color);
        }

        int menu;
        do {

        System.out.println("=======Menu=======");
        System.out.println("1 - Порахувати вік усіх драконів");
        System.out.println("2 - Знайти найлегшого дракона");
        System.out.println("3 - Знайти найстарішого дракона");
        System.out.println("4 - Завершити програму");
        System.out.print("Ваш вибір: ");

        menu = scanner.nextInt();
        switch (menu) {
            case 1 -> {
                int sumAge = 0;
                for (Dragon a : dragons) {
                    sumAge = sumAge + a.getAge();
                }
                System.out.println("Сумарний вік усіх драконів: " + sumAge);
            }
            case 2 -> {
                Dragon lightest = dragons[0];
                for (Dragon b : dragons) {
                    if (b.getWeight() < lightest.getWeight()) {
                        lightest = b;
                    }
                }
                System.out.println("Найлегший дракон: " + lightest.getName() + " (вага: " + lightest.getWeight() + ")");
            }

            case 3 -> {
                Dragon oldest = dragons[0];

                for (Dragon d : dragons) {
                    if (d.getAge() > oldest.getAge()) {
                        oldest = d;
                    }
                }

                System.out.println("Найстаріший дракон: " + oldest.getName() + " (вік: " + oldest.getAge() + ")");
            }
            case 4 -> System.out.println("Завершити програму");
            default -> System.out.println("Невірно набраний номер!Спробуйте ще");
        }

    } while(menu !=4);

     scanner.close();

}
}

