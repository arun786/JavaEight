package CollectionFramework;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapCollection {
    public static void main(String[] args) {

        Person p1 = new Person(1, "arun");
        Person p2 = new Person(2, "pushpa");
        Person p3 = new Person(3, "adwiti");
        Person p4 = new Person(4, "arav");

        List<Person> persons = new ArrayList<>();
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);

        Map<String, List<Person>> map = new HashMap<>();
        map.put("Scottsdale", persons);

        //foreach takes a biconsumer
        BiConsumer<String, List<Person>> biConsumer = (k, v) -> System.out.println(k + " : " + v.size());
        map.forEach(biConsumer);

        //getorDefault - returns the key if present else a default value

        List<Person> scottsdale = map.getOrDefault("Scottsdale", Collections.emptyList());
        System.out.println(scottsdale); //this will return list of person

        List<Person> phoenix = map.getOrDefault("phoenix", Collections.emptyList());
        System.out.println(phoenix); //this will return an empty list

        /**
         * It will add the new value if key ot present else the old value will persist
         */
        map.putIfAbsent("Scottsdale", Collections.emptyList());
        System.out.println(map);

        map.put("Phoenix", Arrays.asList(new Person(1, "Frys")));
        System.out.println(map);

        /**
         * map.replace(k key, v newValue)
         */
        Map<String, String> replace = new HashMap<>();
        replace.put("1", "one");
        replace.replace("1", "One"); //If key is present, it will replace the value
        System.out.println(replace);

        replace.replace("2", "two"); //if key is not present, it wont add the value with the new key
        System.out.println(replace);

        replace.replace("1", "One", "newOne");
        System.out.println(replace); //If the key and the oldValue present will be replaced wth the new value

        replace.replace("1", "One", "againnewOne"); //if the value is not present, no affect
        System.out.println(replace);

        //usage of replaceAll
        Map<String, String> replaceAll = new HashMap<>();
        replaceAll.put("1", "one");
        replaceAll.put("2", "Two");

        //replaceAll takes a bifunction
        BiFunction<String, String, String> biFunction = (k, v) -> v.toUpperCase();
        replaceAll.replaceAll(biFunction);
        System.out.println(replaceAll);

        //Requirement, if we want to square the values of the existing value of the key
        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 1);
        numbers.put(2, 6);
        numbers.put(3, 4);
        System.out.println(numbers);
        BiFunction<Integer, Integer, Integer> square = (k, v) -> v * v;
        numbers.replaceAll(square);
        System.out.println(numbers);

        //use of compute
        //requirement, if we need to update the value of map, we can use compute
        Map<String, String> number = new HashMap<>();
        number.put("name", "Arun");
        number.put("address", "scottsdale");
        BiFunction<String, String, String> compute = (k, v) -> v.concat(" az");
        number.compute("address", compute);
        System.out.println(number);

        //compute if absent, will call the function only when the value is not present
        Function<String, String> f = k -> "pushpa";
        number.computeIfAbsent("newName", f);
        System.out.println(number);

        //BiFunction will only be called when the value is present
        number.computeIfPresent("name", compute);
        System.out.println(number);

    }
}


@Getter
@Setter
@AllArgsConstructor
@ToString
class Person {
    private int id;
    private String name;
}