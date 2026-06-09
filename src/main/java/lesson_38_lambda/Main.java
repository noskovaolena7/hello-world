package lesson_38_lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static lesson_38_lambda.Maps.map3;

public class Main {

    static void main() {

        List<Integer> numbers = Arrays.asList(3, 2, 4, 2, 3, 4, 5, 6,3);
        Unique unique = new Unique();
        List<Integer> result = unique.uniqueFirst(numbers);
        System.out.println(result);

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("a", 3);
        map1.put("c", 4);
        map1.put("d", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("a", 5);
        map2.put("b", 3);
        map2.put("c", 2);

        Map<String, Integer> result1 = map3(map1, map2);

        System.out.println(result1);
    }
}
