package JavaInAction.Streams;

import java.util.Arrays;
import java.util.List;

public class TruncateStream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 13, 14, 15, 12, 13, 15, 6);
        numbers.stream().distinct().limit(2).forEach(System.out::println);
    }
}
