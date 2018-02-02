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
            
     
 ## Use of Map
 
        List<String> words = Arrays.asList("one", "two", "three", "four");
        words.stream().map(word -> word.length()).forEach(System.out::println);
        
        Map<String, Integer> mapOfWord = words.stream().collect(Collectors.toMap(d -> d, d -> d.length()));
        System.out.println(mapOfWord);
        
## Use Of Map on Map

        List<Dish> dishes = DishBuilder.dishBuilder();
        List<Integer> lengthOfDishName = dishes.stream().map(dish -> dish.getName()).map(String::length).collect(Collectors.toList());
        System.out.println(lengthOfDishName);
        
## Use of FlatMap

        /**
        * requirement is to find distinct words from a list of words
        */
        
        List<String> word = Arrays.asList("apple", "banana");
        List<String> uniqueCharacters = word.stream().map(w -> w.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(uniqueCharacters);
        
## Double numbers present in a list

        /**
        * to double the numbers present in a list
        */
        
        List<Integer> numbers = Arrays.asList(1, 4, 5, 8, 9);
        List<Integer> doubleNumbers = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(doubleNumbers);
        
## flat map

        /**
        * if we have two arrays [1,3,4]  and [2,5]
        * we should get [(1,2),(1,5),(3,2),(3,5),(4,2),(4,5)]
        */
        List<Integer> numbers1 = Arrays.asList(1, 3, 4);
        List<Integer> numbers2 = Arrays.asList(2, 5);
        
        List<int[]> result = numbers1.stream().flatMap(n1 -> numbers2.stream().map(n2 -> new int[]{n1, n2})).collect(Collectors.toList());
        result.forEach(d -> System.out.print(Arrays.toString(d) + " "));