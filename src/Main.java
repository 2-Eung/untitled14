import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("사과", 17980);          // Map은 put 으로 값을 넣는다. (add 가 아님)
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);

        System.out.println(fruitPrices.getOrDefault("사과", 500));
        System.out.println(fruitPrices.getOrDefault("포도", 500));
    }
}