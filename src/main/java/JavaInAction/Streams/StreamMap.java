package JavaInAction.Streams;

import Streams.Dish;
import util.DishBuilder;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("one", "two", "three", "four");
        words.stream().map(word -> word.length()).forEach(System.out::println);

        Map<String, Integer> mapOfWord = words.stream().collect(Collectors.toMap(d -> d, d -> d.length()));
        System.out.println(mapOfWord);


        List<Dish> dishes = DishBuilder.dishBuilder();
        List<Integer> lengthOfDishName = dishes.stream().map(dish -> dish.getName()).map(String::length).collect(Collectors.toList());
        System.out.println(lengthOfDishName);

        /**
         * requirement is to find distinct words from a list of words
         */

        List<String> word = Arrays.asList("apple", "banana");
        List<String> uniqueCharacters = word.stream().map(w -> w.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(uniqueCharacters);

        /**
         * to double the numbers present in a list
         */

        List<Integer> numbers = Arrays.asList(1, 4, 5, 8, 9);
        List<Integer> doubleNumbers = numbers.stream().map(n -> n * 2).collect(Collectors.toList());
        System.out.println(doubleNumbers);

        /**
         * if we have two arrays [1,3,4]  and [2,5]
         * we should get [(1,2),(1,5),(3,2),(3,5),(4,2),(4,5)]
         */
        List<Integer> numbers1 = Arrays.asList(1, 3, 4);
        List<Integer> numbers2 = Arrays.asList(2, 5);

        List<int[]> result = numbers1.stream().flatMap(n1 -> numbers2.stream().map(n2 -> new int[]{n1, n2})).collect(Collectors.toList());
        result.forEach(d -> System.out.print(Arrays.toString(d) + " "));
    }


}

/*output will be
3
3
5
4
{four=4, one=3, three=5, two=3}
*/
