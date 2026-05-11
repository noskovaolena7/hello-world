package lesson_19_recursion_homework;

import java.util.Scanner;

public class Main {

    public static int fib(int n) {

        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;

        return fib(n -1) + fib(n-2);

    }

    static void main() {

        // System.out.println(fib(20));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Звернiть увагу максимальне число для вводу 46!");
        System.out.print("Введіть число n: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci(" + n + ") = " + fib(n));

        scanner.close();
    }

}
/*  Математично:
Максимального числа Фібоначчі не існує.

📌 У Java:
для int максимум — F(46)

для long максимум — F(92)

для BigInteger — можна рахувати хоч F(1000000)*/