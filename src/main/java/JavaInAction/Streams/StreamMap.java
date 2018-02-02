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
    }


}

/*output will be
3
3
5
4
{four=4, one=3, three=5, two=3}
*/
