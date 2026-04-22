package lesson_10_if_else_else_if;

import java.util.Arrays;

public class Main {

    static void main(){


        // Написати програму що, робить останній елемент масиву додатнім


        int[] numbers = {7, 12, 35, -17};

        int lastNumberIdx = numbers.length - 1;

        int firstNumber = numbers[0];
        int lastNumber = numbers[lastNumberIdx];

        if (lastNumber < 0) {
            numbers[lastNumberIdx] = lastNumber * -1;
        }
        // Написати програму що, робить елемент масиву під індексом 0 вдвічі більшим

        int [] numbers1 = {10, 15, 17, 31};

        int firstNumber1 = numbers1[0];

        numbers1[0] = firstNumber1 * 2;

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbers1));

    }
}
