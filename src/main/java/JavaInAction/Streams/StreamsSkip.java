package JavaInAction.Streams;

import java.util.Arrays;
import java.util.List;

public class StreamsSkip {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 12, 13, 14, 10, 12, 15, 23);

        numbers.stream().skip(3).forEach(System.out::println); //It will skip the first 3 elements
    }
}
