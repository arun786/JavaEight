package Streams;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.List;

@RunWith(JUnit4.class)
public class ExplanationOfStreamTest {

    private ExplanationOfStream subject;
    private List<String> names;
    private Long testCount;

    @Before
    public void setUp() {
        subject = new ExplanationOfStream();
        names = Arrays.asList("Arun", "Sachin", "RahulDravid", "Adwiti", "Pushpa");
        testCount = Long.valueOf(0);
    }

    @Test
    public void getNamesLessThan10CharactersTest() {
        List<String> namesLessThan10Characters = subject.getNamesLessThan10Characters(names);
        namesLessThan10Characters.forEach(name ->
                Assert.assertTrue(name.length() < 10)
        );
    }

    /**
     * This method checks names are converted to uppercase
     */
    @Test
    public void convertToUpperCase() {
        List<String> upperCaseName = subject.convertToUpperCase(names);
        for (int i = 0; i < upperCaseName.size(); i++) {
            Assert.assertTrue(upperCaseName.get(i).equals(names.get(i).toUpperCase()));
        }
    }


    /**
     * This will check the count of names whose characters are less than 8
     */
    @Test
    public void getCountOfNamesGreaterThan8Characters() {
        Long count = subject.getCountOfNamesLessThan8Characters(names);
        names.forEach(name -> {
            if (name.length() < 8) {
                testCount++;
            }
        });
        Assert.assertTrue(count == testCount);
    }
}
