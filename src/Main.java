import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Box {
    public static <T> void displayArray(List<T> array) {
        for(T element: array) {
            System.out.println(element);
        }
    }
}

public class Main {
    public static void main(String[] args) {
//        List<Integer> numbers = List.of(1, 2, 3, 4, 5); // 이 경우는 ArrayList 가 아니다.
//        numbers.add(1);                                 // 이 경우 불변한녀석이어서 불가능

        List<String> numbers = new ArrayList<>(List.of("1", "2", "3", "4", "5"));
                                                          // 옳게 ArrayList 가 된녀석.
        List<String> numberss = new ArrayList<>(Arrays.asList("1", "2", "3"));
                                                          // 또는 이렇게
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");

        Box.displayArray(numbers);
        Box.displayArray(words);
    }
}