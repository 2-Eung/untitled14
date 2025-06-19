import java.util.Arrays;
import java.util.List;
public class Main {

    public static void printElements(List<?> list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
    public static double sumList(List<? extends Number> list) {
        double sum = 0;
        for (Number n : list) {             // n 의 요소는 Number 이다.
            sum += n.doubleValue();     // .doubleValue() 는 뭐지???
                                        // List 의 값을 꺼내오는거랑관련있나??
                                        // get 함수 같은건가?
            if(n instanceof Integer) {          // Number 중 Integer 라면?
                Integer.toHexString((Integer) n);
            } else if (n instanceof  Double) {  // Number 중 Double 이라면?

            }   // T 말고 ? extend 를 쓰는이유는 T 가 더 넓어서 예외사항이 (if) 많으면
        }       // ? extend 는 한번 걸러서 예외사항을 큰범위로 한번 없애서인가??
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3);
        List<String> words = Arrays.asList("a", "b", "c");

        printElements(numbers);
        printElements(words);
        System.out.println(sumList(numbers));

        List<Integer> intList = Arrays.asList(10, 20, 30);
        List<Double> doubleList = Arrays.asList(0.1, 0.2);

        System.out.println("합계: " + sumList(intList));
        System.out.println("합계: " + sumList(doubleList));

    }
}