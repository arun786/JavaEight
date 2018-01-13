package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Create a List, add random numbers,
 * filter out even numbers
 */
public class BasicOfStreams {

    /**
     * Before Java 8
     */
    public List<Integer> getEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNumber = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumber.add(number);
            }
        }
        return evenNumber;
    }

    /**
     * With Java 8 with Streams
     */
    public List<Integer> getEvenNumbersUsingStream(List<Integer> numbers) {
        List<Integer> lst = numbers.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        return lst;
    }

}
