package lesson_13_scanner_homework;

   import java.util.Scanner;

   public class Main {

       void main() {
           Scanner scanner = new Scanner(System.in);

           // Зчитати з клавіатури розмір масиву n. (n x m - для сміливих)
           System.out.print("Розмір масиву : ");
           int n = scanner.nextInt();
           System.out.println("Ви ввели " + n);

           // Створити масив цілих чисел і заповнити його даними користувача
           int[] array = new int[n];
           System.out.println("Створити масив цілих чисел");
           for (int i = 0; i < array.length; i++) {
               System.out.println("Введіть елемент масиву на позиції " + i);
               array[i] = scanner.nextInt();
           }
           // Виводимо введений масив в консоль
           System.out.println("Масив має вигляд: ");
           for (int i = 0; i < array.length; i++) {
               System.out.print(array[i] + " ");
           }
           System.out.println();

           // Вивести текстове меню
           int menu;
           do {
               System.out.println("=======Menu=======");
               System.out.println("1 - Порахувати суму елементів");
               System.out.println("2 - Знайти середнє арифметичне всіх елементів");
               System.out.println("3 - Знайти найбільший елемент");
               System.out.println("4 - Завершити програму");
               System.out.print("Ваш вибір: ");

               menu = scanner.nextInt();
               switch (menu) {
                   case 1 -> {
                       int sum = 0;
                       for (int a : array) {
                           sum = sum + a;
                       }
                       System.out.println("Сума елементів у масиві: " + sum);
                   }
                   case 2 -> {
                       int sum = 0;
                       for (int a : array) {
                           sum = sum + a;
                       }
                       System.out.println("Середнє арифметичне значення: " + sum / array.length);
                   }

                   case 3 -> {
                       int max = array[0];
                       for (int i = 0; i < array.length; i++) {
                           if (array[i] > max) {
                               max = array[i];
                           }
                       }
                       System.out.println("Hайбільший елемент: " + max);
                   }

                   case 4 -> System.out.println("Завершити програму");

               }

           } while (menu != 4);
       }

   }
           // Двовимiрний масив
             /*  Scanner scanner = new Scanner(System.in);

               // Зчитуємо розміри масиву
               System.out.print("Введіть n (рядки): ");
               int n = scanner.nextInt();

               System.out.print("Введіть m (стовпці): ");
               int m = scanner.nextInt();

               int[][] array = new int[n][m];

               // Заповнюємо масив
               System.out.println("Введіть елементи масиву:");
               for (int i = 0; i < n; i++) {
                   for (int j = 0; j < m; j++) {
                       System.out.print("array[" + i + "][" + j + "] = ");
                       array[i][j] = scanner.nextInt();
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
                                   sum = sum + b;
                               }
                           }
                           System.out.println("Сума всіх елементів: " + sum);
                       }

                       case 2 -> {
                           int sum = 0;
                           int count = n * m;

                           for (int[] a : array) {
                               for (int b : a) {
                                   sum = sum + b;
                               }
                           }
                           System.out.println("Середнє арифметичне значення: " + sum / array.length);
                       }

                       case 3 -> {
                           int max = array[0][0];

                           for (int[] a : array) {
                               for (int b : a) {
                                   if (b > max) {
                                       max = b;
                                   }
                               }
                           }
                           System.out.println("Найбільший елемент: " + max);
                       }

                       case 4 -> System.out.println("Програму завершено.");
                   }

               } while (menu != 4);
       }
   } */


