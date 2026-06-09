package lesson_38_lambda;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static Map<String, Integer> map3(Map<String, Integer> map1, Map<String, Integer> map2){
        Map<String, Integer> result1 = new HashMap<>();
        for (String key : map1.keySet()) {
            result1.put(key, map1.get(key));
        }

        for (String key : map2.keySet()) {
            if (result1.containsKey(key)) {
                int sum = result1.get(key) + map2.get(key);
                result1.put(key, sum);
            } else {
                result1.put(key, map2.get(key));
            }
        }
        return result1;
    }
}
