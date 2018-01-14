package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class SortingOfCollectionClassUsingStream {

    /**
     * @param numbers
     * @return This method will sort a List in ascending order
     */
    public List<Integer> sortAListWhichHasNumbers(List<Integer> numbers) {
        return numbers.stream().sorted().collect(Collectors.toList());
    }

    public List<Integer> sortAListWhichHasNumbersInDescendingOrder(List<Integer> numbers) {
        return numbers.stream().sorted((num1, num2) -> -num1.compareTo(num2)).collect(Collectors.toList());
    }
}
