# Streams

Example of Stream


    public class Dish {
        private String name;
        private Integer calorie;
    
        public Dish(String name, Integer calorie) {
            this.name = name;
            this.calorie = calorie;
        }
    
        public String getName() {
            return name;
        }
    
        public Integer getCalorie() {
            return calorie;
        }
    
        @Override
        public String toString() {
            return "Dish{" +
                    "name='" + name + '\'' +
                    ", calorie=" + calorie +
                    '}';
        }
    }



    import java.util.ArrayList;
    import java.util.Comparator;
    import java.util.List;
    import java.util.stream.Collectors;

    public class StreamUse {
    
        public List<Dish> getDishWhoseCalorieIsLessThan100() {
            List<Dish> lstDish = dishBuilder();
            return lstDish.stream().filter(d -> d.getCalorie() < 100).collect(Collectors.toList());
        }
    
        public List<Dish> getDishCalorieGreaterThan100InSortedOrder() {
            List<Dish> lstDish = dishBuilder();
            return lstDish.stream()
                    .filter(d -> d.getCalorie() > 100)  //Select Dishes which are greater than 100
                    .sorted(Comparator.comparing(Dish::getCalorie)) //Sort it using a comparator
                    .collect(Collectors.toList()); //Collect in a list
        }
    
        public List<String> getDishNameCalorieGreaterThan100InSortedOrder() {
            List<Dish> lstDish = dishBuilder();
            return lstDish.stream()
                    .filter(d -> d.getCalorie() > 100)
                    .sorted(Comparator.comparing(Dish::getCalorie))
                    .map(Dish::getName)
                    .collect(Collectors.toList());
        }
    
        public List<Dish> dishBuilder() {
            List<Dish> lstDish = new ArrayList<>();
            lstDish.add(new Dish("Dosa", 300));
            lstDish.add(new Dish("Pizza", 500));
            lstDish.add(new Dish("Burger", 50));
            lstDish.add(new Dish("Roti", 40));
    
            return lstDish;
        }
    }


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

## Use Of Distinct

            List<Integer> numbers = Arrays.asList(10,12,13,14,35,12,23,45);
            List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());
            System.out.println(distinctNumbers);
            
            
            
## Use Of Limit

            List<Integer> numbers = Arrays.asList(12, 13, 14, 15, 12, 13, 15, 6);
            numbers.stream().distinct().limit(2).forEach(System.out::println);
            
## Use of Skip

            List<Integer> numbers = Arrays.asList(10, 12, 13, 14, 10, 12, 15, 23);
            numbers.stream().skip(3).forEach(System.out::println); //It will skip the first 3 elements