package Journey;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class ThirdAttemptTest {

    private ThirdAttempt ta;

    @Before
    public void setup() {
        ta = new ThirdAttempt();
    }

    @Test
    public void getGreenFruits() {
        ta.getGreenFruits().forEach(fruit -> {
            assertEquals(fruit.getColor(), "green");
        });
    }

    @Test
    public void getFruitsGreaterThan10() {
        ta.getFruitsGreaterThan10().forEach(fruit -> {
            assertTrue(fruit.getWeight() > 10);
        });
    }
}
