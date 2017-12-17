package Journey;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SecondAttemptTest {

    private SecondAttempt sa;

    @Before
    public void setUp() {
        sa = new SecondAttempt();
    }

    @Test
    public void GreenColorTest() {

        sa.GetFruitsWhichAreGreen().forEach(fruit -> {
            assertEquals(fruit.getColor(), "green");
        });
    }

    @Test
    public void WeightGreaterThan10() {
        sa.getFruitsGreaterThan10().forEach(fruit -> {
            assertTrue(fruit.getWeight() > 10);
        });
    }
}
