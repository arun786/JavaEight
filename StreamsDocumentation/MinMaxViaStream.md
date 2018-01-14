# Use Of Stream for getting Min and Max from a List

## Get Max from a given List

### Java Class

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

## Test Class

    package Streams;
    
    import org.junit.Assert;
    import org.junit.Before;
    import org.junit.Test;
    import org.junit.runner.RunWith;
    import org.junit.runners.JUnit4;
    
    import java.util.ArrayList;
    import java.util.List;
    
    @RunWith(JUnit4.class)
    public class GetMinMaxUsingStreamTest {
    
        private GetMinMaxUsingStream subject;
        private List<Integer> numbers = new ArrayList<>();
    
        @Before
        public void setUp() {
            subject = new GetMinMaxUsingStream();
            for (int i = 0; i < 10; i++) {
                numbers.add((int) (Math.random() * 100));
            }
        }
    
        @Test
        public void getMaxValueTest() {
            int max = subject.getMaxValue(numbers);
            /**
             * Bubble Sort to sort the List of Numbers, when the first
             * Iteration completes, largest number is at the end of the array,
             * so we are iterating only once. This is partial implementation
             * of Bubble Sort, the Whole array wont be sorted, we will get only
             * the max value
             */
            Object arrayNumbers[] = numbers.toArray();
            int j = arrayNumbers.length;
            for (int i = 0; i < j - 1; i++) {
                if (Integer.parseInt(arrayNumbers[i].toString()) > Integer.parseInt(arrayNumbers[i + 1].toString())) {
                    swap(i, i + 1, arrayNumbers);
                }
            }
            Assert.assertTrue(Integer.parseInt(arrayNumbers[numbers.size() - 1].toString()) == max);
        }
    
        @Test
        public void getMinValueTest() {
            int min = subject.getMinValue(numbers);
            /**
             * We will use Selection sort to get the minimum value
             * Selection sort finds the smallest value when one iteration
             * is complete. then the numbers are swapped. this is not full
             * implementation of Selection sort
             */
    
            Object arrayNumbers[] = numbers.toArray();
            int minimumIndex = 0;
            for (int i = 0; i < arrayNumbers.length - 1; i++) {
                if (Integer.parseInt(arrayNumbers[i].toString()) < Integer.parseInt(arrayNumbers[minimumIndex].toString())) {
                    minimumIndex = i;
                }
            }
            swap(0, minimumIndex, arrayNumbers);
    
            int minimum = Integer.parseInt(arrayNumbers[0].toString());
            Assert.assertEquals(min, minimum);
        }
    
    
        private void swap(int i, int j, Object[] arrayNumbers) {
            Object temp = arrayNumbers[i];
            arrayNumbers[i] = arrayNumbers[j];
            arrayNumbers[j] = temp;
        }
    }
