# Streams 

## Basic Streams before and with Java 8

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
    
 ### Test Class
 
    package Streams;
    
    import org.junit.Before;
    import org.junit.Test;
    import org.junit.runner.RunWith;
    import org.junit.runners.JUnit4;
    
    import java.util.ArrayList;
    import java.util.List;
    
    import static junit.framework.TestCase.assertFalse;
    import static junit.framework.TestCase.assertTrue;
    
    @RunWith(JUnit4.class)
    public class BasicStreamTest {
    
        private BasicOfStreams subject;
        private List<Integer> numbers;
    
        @Before
        public void setUp() {
            subject = new BasicOfStreams();
            numbers = listBuilder();
        }
    
        /**
         * This method checks if the numbers are even number
         */
        @Test
        public void getEvenNumbersTest() {
            List<Integer> evenNumbers = subject.getEvenNumbers(numbers);
            evenNumbers.forEach(num -> {
                assertTrue(num % 2 == 0);
            });
        }
    
        /**
         * This method will check if the numbers are even
         */
        @Test
        public void getEvenNumbersUsingStreamTest() {
            List<Integer> evenNumbers = subject.getEvenNumbersUsingStream(numbers);
            evenNumbers.forEach(num -> {
                assertFalse(num % 2 != 0);
            });
        }
    
        private List<Integer> listBuilder() {
            List<Integer> lst = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                int number = (int) (Math.random() * 100);
                lst.add(number);
            }
            return lst;
        }
    }

