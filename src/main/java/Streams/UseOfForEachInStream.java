package Streams;

import java.util.Arrays;
import java.util.List;

public class UseOfForEachInStream {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arun", "Pushpa", "Adwiti");
        /**
         * Using Lambda Expression
         */
        names.stream().forEach(name -> System.out.println(name));
        /**
         * Using Method Reference
         */
        names.stream().forEach(System.out::println);
    }
}
