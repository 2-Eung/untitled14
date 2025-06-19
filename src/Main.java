import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("사과", 17980);          // Map은 put 으로 값을 넣는다. (add 가 아님)
        fruitPrices.put("배", 10320);
        fruitPrices.put("수박", 15920);
        fruitPrices.put("멜론", 10630);
        fruitPrices.put("멜론", 50000);          // 키값이 중복되면 나중에 put 된것으로 덮어쓴다

        System.out.println(fruitPrices.size()); // 그냥 4가 나옴
        // 전체를 순회하려면
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {   // .entrySet() 필요
            System.out.print(entry.getKey() + " 가격은 ");          // 키값 출력
            System.out.print(entry.getValue() + " 원 입니다.\n");   // 벨류값 출력
        }
        // 키값과 벨류값을 둘 다 꺼내오고 싶으면 'Entry' (Map.Entry<,> entry new : fruitPrices.entrySet())
        int sum = 0;
        for (Integer fruitPrice : fruitPrices.values()) {
            sum += fruitPrice;
        }
        // 둘중 하나만 사용하고 싶으면 사용하려는 타입을가진 요소로 foreach.
        // 여기서는 Integer fruitPrice : ( int 로 대체 가능 )

        System.out.println(sum/fruitPrices.size());
    }
}