import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("사과", 17980);          // Map은 put 으로 값을 넣는다. (add 가 아님)
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);

        System.out.println(fruitPrices.containsKey("사과"));  // contain 은 true/false 로 반환한다.
        System.out.println(fruitPrices.containsKey("포도"));
        System.out.println(fruitPrices.containsValue(17980));
        System.out.println(fruitPrices.containsValue(9999));
    }
}