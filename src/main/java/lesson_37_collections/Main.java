package lesson_37_collections;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {

    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(10);
    numbers.add(13);

    Integer sum = NumberUtils.getSum(numbers);
    System.out.println("Сума чисел: " + sum);

    List<Integer> multiplied = NumberUtils.multiplyOddNumber(numbers);
    System.out.println("Непарні числа, помножені на 2: " + multiplied);

    }
}
