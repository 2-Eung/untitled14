import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new TreeMap<>();

        fruitPrices.put("사과", 17980);          // Map은 put 으로 값을 넣는다. (add 가 아님)
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);

        for(Map.Entry<String, Integer> entry: fruitPrices.entrySet()) { // 키값 기준 오름차순으로 정렬
            System.out.println(entry.getKey() + entry.getValue());
        }
    }
}