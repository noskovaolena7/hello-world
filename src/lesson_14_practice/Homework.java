package lesson_14_practice;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {

            // Двовимірний масив
            Scanner scanner = new Scanner(System.in);

            // Зчитуємо розміри масиву
            System.out.print("Введіть n (рядки): ");
            int n = scanner.nextInt();

            System.out.print("Введіть m (стовпці): ");
            int m = scanner.nextInt();

            int[][] array = new int[n][m];
            int[][] matrix = new int[n][m];

            // Заповнюємо array
            System.out.println("Введіть елементи масиву array:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.printf("array[%d][%d] = ", i, j);
                    array[i][j] = scanner.nextInt();
                }
            }

            // Заповнюємо matrix
            System.out.println("Введіть елементи масиву matrix:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.printf("matrix[%d][%d] = ", i, j);
                    matrix[i][j] = scanner.nextInt();
                }
            }

            int menu;

            // Меню повторюється, поки користувач не вибере 4
            do {
                System.out.println("======= МЕНЮ =======");
                System.out.println("1 - Порахувати суму елементів");
                System.out.println("2 - Знайти середнє арифметичне всіх елементів");
                System.out.println("3 - Знайти найбільший елемент");
                System.out.println("4 - Завершити програму");
                System.out.print("Ваш вибір: ");

                menu = scanner.nextInt();

                switch (menu) {

                    case 1 -> {
                        int sum = 0;

                        for (int[] a : array)
                            for (int b : a)
                                sum += b;

                        for (int[] a : matrix)
                            for (int b : a)
                                sum += b;

                        System.out.println("Сума всіх елементів: " + sum);
                    }

                    case 2 -> {
                        int sum = 0;
                        int count = n * m * 2; // два масиви

                        for (int[] a : array)
                            for (int b : a)
                                sum += b;

                        for (int[] a : matrix)
                            for (int b : a)
                                sum += b;

                        double average = (double) sum / count;
                        System.out.println("Середнє арифметичне значення: " + average);
                    }

                    case 3 -> {
                        int max = array[0][0];

                        for (int[] a : array)
                            for (int b : a)
                                if (b > max)
                                    max = b;

                        for (int[] a : matrix)
                            for (int b : a)
                                if (b > max)
                                    max = b;

                        System.out.println("Найбільший елемент: " + max);
                    }

                    case 4 -> System.out.println("Програму завершено.");

                    default -> System.out.println("Невірно набраний номер!");
                }

            } while (menu != 4);

            scanner.close();
        }

    }

/* import java.util.Scanner;

public class Homework {

    void main() {

        // Двовимірний масив
        Scanner scanner = new Scanner(System.in);

        // Зчитуємо розміри масиву
        System.out.print("Введіть n (рядки): ");
        int n = scanner.nextInt();

        System.out.print("Введіть m (стовпці): ");
        int m = scanner.nextInt();

        int[][] array = new int[n][m];
        int[][] matrix = new int[n][m];

        // Заповнюємо масив
        System.out.println("Введіть елементи масиву:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                //            [i, j]  [i, j]
                //
                //            [0, 0]  [0, 1]
                //               1      2
                //
                //            [1, 0]  [1, 1]
                //               3       4
                System.out.printf("array[%d][%d] = ", i, j);
                array[i][j] = scanner.nextInt();
                matrix[i][j] = scanner.nextInt();
            }
        }

        int menu;

        // Меню повторюється, поки користувач не вибере 4
        do {
            System.out.println("======= МЕНЮ =======");
            System.out.println("1 - Порахувати суму елементів");
            System.out.println("2 - Знайти середнє арифметичне всіх елементів");
            System.out.println("3 - Знайти найбільший елемент");
            System.out.println("4 - Завершити програму");
            System.out.print("Ваш вибір: ");

            menu = scanner.nextInt();

            switch (menu) {

                case 1 -> {
                    int sum = 0;
                    for (int[] a : array) {
                        for (int b : a) {
                    for (int[] array : matrix) {
                        for (int b : array) {
                            sum = sum + b;
                        }
                    }
                    System.out.println("Сума всіх елементів: " + sum);
                }

                case 2 -> {
                    int sum = 0;
                    int count = n * m;

                    for (int[] a : array) {
                    for (int[] a : matrix) {
                        for (int b : a) {
                            sum = sum + b;
                        }
                    }

                    double average = (double) sum / count;
                    System.out.println("Середнє арифметичне значення: " + average);
                }

                case 3 -> {
                    int max = array[0][0];
                    int max = matrix[0][0];

                    for (int[] a : array) {
                    for (int[] a : matrix) {
                        for (int b : a) {
                            if (b > max) {
                                max = b;
                            }
                        }
                    }
                    System.out.println("Найбільший елемент: " + max);
                }

                case 4 -> System.out.println("Програму завершено.");
                default -> System.out.println("Невірно набраний номер!");
            }

        } while (menu != 4);
        scanner.close();
    }
    } */


