package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class BasicOfStreamAddToAMap {

    /**
     * @param numbers
     * @return double the numbers in a list and store it in a new List
     */
    public List<Integer> getDoubleOfNumber(List<Integer> numbers) {
        List<Integer> doubleNumber = numbers.stream().map(number -> number * 2).collect(Collectors.toList());
        return doubleNumber;
    }
}
