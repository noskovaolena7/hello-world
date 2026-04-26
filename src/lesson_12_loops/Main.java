package lesson_12_loops;

public class Main {

    static void main() {

        int x = 10;

        // while loop
        while (x > 5) {
            System.out.println("Значення x: " + x);

            x--;
        }

        // do while
        do {
            System.out.println("Значення x: " + x);
            x++;
        } while (x > 10);

        // for loop
        for (int i = 10; i <= 15; i++) {
            System.out.println("Значення i: " + i);
        }


       /* int[] numbers = {10, 20, 30, 40, 50};

        // classic for loop + break
        System.out.println("Classic for loop + break");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 30) {
                break;
            }
                    System.out.println(numbers[i]);
            }

                // for each + break
                System.out.println("For each + break");
                for (int n : numbers) {
                    if (n == 30) {
                        break;
                    }
                    System.out.println(n);
                }

                // for each + continue
                System.out.println("For each + continue");
                for (int n : numbers) {
                    if (n == 30) {
                        continue;
                    }
                    System.out.println(n);
                }
            */

                int[] arr = {-40, -30,-20, -10, 0, 10, 20, 30, 40};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Написати програму що виводить тільки додатні елементи масиву
        System.out.println("Додатні елементи масиву");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println(arr[i] + " ");
            }
        }

        // Написати програму що робить усі від’ємні елементи масиву
        // додатніми і збільшує їх удвічі застосовуючи елвіс оператор.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] < 0 ? arr[i] * -2 : arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Створити масив int та ініціалізувати його будь-якими числами

        int [] numberCars = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

            // Вивести до консолі лише парні числа масиву
            for (int k = 0; k <= 10; k = k+2) {

                System.out.println(k);
            }

            }

        }
