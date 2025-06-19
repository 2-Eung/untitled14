import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object[] arr = new Integer[3]; // 배열은 공변이다. 그래서 상위타입으로 바뀐다.
//        arr[1] = "Hello";   // 상위타입으로 바뀌엇기때문에 문자가 입력은된다.
                            // 그러나 실행하면 런타임 오류가 발생한다. 불안정해진다.
//        List<Object> arr = new ArrayList<Integer>();            // 제네릭은 불공변 이다. 컴파일오류발생

        List<? extends Number> arra = new ArrayList<Integer>(); // 제네릭에서 공변성을 부여하기위한 작업.
    }
}