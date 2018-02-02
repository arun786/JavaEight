package JavaInAction.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDistinct {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(10, 12, 13, 14, 35, 12, 23, 45);
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNumbers);

        /*output will be
                [10, 12, 13, 14, 35, 23, 45]*/


        numbers.stream().distinct().forEach(System.out::println);

    }

}
