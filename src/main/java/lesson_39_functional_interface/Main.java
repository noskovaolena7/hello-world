package lesson_39_functional_interface;

import java.util.function.*;

public class Main {
    static void main() {

        //Predicate: перевірка, чи є число простим
        Predicate<Integer> isNumberPrime = n -> {
            if (n < 2 || (n > 2 && n % 2 == 0)) return false;
            for (int i = 3, limit = (int) Math.sqrt(n); i <= limit; i += 2)
                if (n % i == 0) return false;
            return true;
        };
        System.out.println(isNumberPrime.test(11));
        System.out.println(isNumberPrime.test(8));
        System.out.println(isNumberPrime.test(15));
        System.out.println(isNumberPrime.test(3));

        // Consumer: генерує число від 0 до заданого та виводимо в консоль.
        Consumer<Integer> generate= max -> {
            int number = (int) (Math.random() * (max + 1));
            System.out.println("Our generated number: " + number);
        };
        generate.accept(100);
        generate.accept(1000);

        //Supplier: повертає випадковий день тижня
        Supplier<Integer> randomDay = () -> (int) (Math.random() * 7) + 1;
        System.out.println("Our random day " + randomDay.get());

        //Function: округляє Double у Long за правилами математики
        Function<Double, Long> roundingWithMathRules = x -> Math.round(x);
        System.out.println("Our rounding: " + roundingWithMathRules.apply(275.5));
        System.out.println("Our rounding: " + roundingWithMathRules.apply(13.2));

        //UnaryOperator: обчислює число Фібоначчі
        UnaryOperator<Integer> numberFibonacci = n -> {
            int a = 0, b = 1;
            for (int i = 0; i < n; i++) {
                int t = a + b;
                a = b;
                b = t;
            }
            return a;
        };
        System.out.println("Our Fibonacci number: " + numberFibonacci.apply(10));
        System.out.println("Our Fibonacci number: " + numberFibonacci.apply(7));
        System.out.println("Our Fibonacci number: " + numberFibonacci.apply(15));
    }
}
