# Use Of Stream for Sorting

## Java Class

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

## Test class

    package Streams;
    
    import org.junit.Assert;
    import org.junit.Before;
    import org.junit.Test;
    import org.junit.runner.RunWith;
    import org.junit.runners.JUnit4;
    
    import java.util.Arrays;
    import java.util.List;
    
    @RunWith(JUnit4.class)
    public class SortingOfCollectionClassUsingStreamTest {
    
        private SortingOfCollectionClassUsingStream subject;
        private List<Integer> numbers;
    
        @Before
        public void setUp() {
            subject = new SortingOfCollectionClassUsingStream();
            numbers = Arrays.asList(10, 5, 23, 12, 21, 78, 0);
        }
    
        /**
         * It checks numbers are in ascending order
         */
        @Test
        public void sortAListWhichHasNumbers() {
            List<Integer> sortedNumbers = subject.sortAListWhichHasNumbers(numbers);
            for (int i = 0; i < sortedNumbers.size() - 1; i++) {
                Assert.assertTrue(sortedNumbers.get(i) < sortedNumbers.get(i + 1));
            }
        }
    
        /**
         * Sorts number in descending order
         */
        @Test
        public void sortAListWhichHasNumbersInDescendingOrderTest() {
            List<Integer> sortedDescOrder = subject.sortAListWhichHasNumbersInDescendingOrder(numbers);
            for (int i = 0; i < sortedDescOrder.size() - 1; i++) {
                Assert.assertTrue(sortedDescOrder.get(i) > sortedDescOrder.get(i + 1));
            }
        }
    }
