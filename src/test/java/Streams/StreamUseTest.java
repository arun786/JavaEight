package Streams;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;


@RunWith(JUnit4.class)
public class StreamUseTest {

    private StreamUse streamUse;

    @Before
    public void setUp() {
        streamUse = new StreamUse();
    }

    @Test
    public void getDishWhoseCalorieIsLessThan100Test() {
        List<Dish> lstDish = streamUse.getDishWhoseCalorieIsLessThan100();
        lstDish.forEach(d ->
                assertTrue(d.getCalorie() < 100)
        );
    }

    @Test
    public void getDishCalorieGreaterThan100InSortedOrderTest() {
        List<Dish> lstDish = streamUse.getDishCalorieGreaterThan100InSortedOrder();
        lstDish.forEach(d ->
                assertTrue(d.getCalorie() > 100)
        );
    }

    @Test
    public void getDishNameCalorieGreaterThan100InSortedOrderTest(){
        List<String> expected = Arrays.asList("Dosa","Pizza");
        List<String> lstDish = streamUse.getDishNameCalorieGreaterThan100InSortedOrder();
        assertEquals(lstDish,expected);
    }

}
