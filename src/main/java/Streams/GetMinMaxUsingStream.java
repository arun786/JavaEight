package Streams;

import java.util.List;

public class GetMinMaxUsingStream {

    /**
     * @param numbers
     * @return This method returns the max value from a given List of Numbers
     */
    public int getMaxValue(List<Integer> numbers) {
        return numbers.stream().max((num1, num2) -> num1.compareTo(num2)).get();
    }

    /**
     * @param numbers
     * @return This method returns the min value from a given List of Numbers
     */
    public int getMinValue(List<Integer> numbers) {
        return numbers.stream().min((num1, num2) -> num1.compareTo(num2)).get();
    }
}
