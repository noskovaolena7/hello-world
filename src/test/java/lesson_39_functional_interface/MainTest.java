package lesson_39_functional_interface;

import org.junit.jupiter.api.Test;
import java.util.function.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;


class MainTest {
    @Test
    void testIsNumberPrime() {
        Predicate<Integer> isNumberPrime = n -> {
            if (n < 2 || (n > 2 && n % 2 == 0)) return false;
            for (int i = 3, limit = (int) Math.sqrt(n); i <= limit; i += 2)
                if (n % i == 0) return false;
            return true;
        };

        assertTrue(isNumberPrime.test(3));
        assertTrue(isNumberPrime.test(11));
        assertTrue(isNumberPrime.test(97));

        assertFalse(isNumberPrime.test(1));
        assertFalse(isNumberPrime.test(8));
        assertFalse(isNumberPrime.test(15));
    }

    @Test
    void testRoundingWithMathRules() {
        Function<Double, Long> rounding = x -> Math.round(x);

        assertEquals(276L, rounding.apply(275.5));
        assertEquals(13L, rounding.apply(13.2));
        assertEquals(20L, rounding.apply(19.6));
    }

    @Test
    void testFibonacci() {
        UnaryOperator<Integer> numberFibonacci = n -> {
            int a = 0, b = 1;
            for (int i = 0; i < n; i++) {
                int t = a + b;
                a = b;
                b = t;
            }
            return a;
        };

        assertEquals(0, numberFibonacci.apply(0));
        assertEquals(1, numberFibonacci.apply(1));
        assertEquals(1, numberFibonacci.apply(2));
        assertEquals(2, numberFibonacci.apply(3));
        assertEquals(5, numberFibonacci.apply(5));
        assertEquals(13, numberFibonacci.apply(7));
        assertEquals(55, numberFibonacci.apply(10));
    }

    @Test
    void testRandomDaySupplier() {
        Supplier<Integer> randomDay = () -> (int) (Math.random() * 7) + 1;

        int day = randomDay.get();
        assertTrue(day >= 1 && day <= 7);
    }

    @Test
    void testConsumerGenerate() {
        Consumer<Integer> generate = max -> {
            int number = (int) (Math.random() * (max + 1));
            System.out.println("Generated: " + number);
        };

        assertDoesNotThrow(() -> generate.accept(100));
        assertDoesNotThrow(() -> generate.accept(1000));
    }
}