package Streams;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class BasicOfStreamAddToAMapTest {
    private BasicOfStreamAddToAMap subject;
    private List<Integer> numbers;

    @Before
    public void setUp() {
        subject = new BasicOfStreamAddToAMap();
        numbers = listBuilder();
    }

    @Test
    public void getDoubleOfNumberTest() {
        List<Integer> response = subject.getDoubleOfNumber(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            /**
             * List maintains the insertion order
             */
            Integer newNumber = numbers.get(i) * 2;
            assertEquals(response.get(i), newNumber);
        }
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
