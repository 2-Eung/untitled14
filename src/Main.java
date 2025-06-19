import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("사과", 17980);          // Map은 put 으로 값을 넣는다. (add 가 아님)
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);
//        fruitPrices.put("사과", 8000);         // 이 경우에도 순서는 맨 밑으로 이동한다.

        // put 과 replace 의 차이는 새로운값으로 덮느냐, 기존값을 변경하느냐 이다.
        fruitPrices.replace("사과", 8000);       // 이때 순서는 맨 밑으로 이동한다.
        fruitPrices.replace("포도", 8000);       // replace 는 기존값이 없으면 동작하지 않는다. put 은 추가
        fruitPrices.remove("멜론");

        for(Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + entry.getValue());
        }
        for(String key: fruitPrices.keySet()) { // Key 값만 출력
            System.out.println(key);
        }
    }
}