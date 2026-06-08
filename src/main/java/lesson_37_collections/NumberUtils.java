package lesson_37_collections;

import java.util.ArrayList;
import java.util.List;

public class NumberUtils {

    public static Integer getSum(List<Integer> numbers){
        int sum = 0;
        for (Integer number: numbers) {
            sum += number;
        }
        return sum;
    }

    public static List<Integer> multiplyOddNumber(List<Integer> numbers) {
        List<Integer> results = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 != 0) {
                results.add(number * 2);
            }
        }
        return results;
    }
}
