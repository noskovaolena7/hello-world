package lesson_38_lambda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Unique {

    public List<Integer> uniqueFirst(List<Integer> numbers) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (Integer n : numbers) {
            if (!seen.contains(n)) {
                seen.add(n);
                result.add(n);
            }
        }
        return result;
    }
}
