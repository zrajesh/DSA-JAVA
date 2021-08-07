import java.util.HashMap;
import java.util.Map;

public class HashJava {
    public static void main(String[] args) {
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("one", 1);
        numbers.put("ten", 10);
        numbers.put("five", 5);
        numbers.putIfAbsent("one", 10);

        System.out.println(numbers.get("five"));
    }
}
