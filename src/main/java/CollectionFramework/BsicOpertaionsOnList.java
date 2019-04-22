package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class BsicOpertaionsOnList {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Arun", "Singh", "Pushpa", "yadav", "Adwiti", "Singh", "Arav", "Singh");

        //List takes a consumer for foreach
        Consumer<String> consumer = System.out::println;
        names.forEach(consumer);

        //replaceAll takes a UnaryOperator
        UnaryOperator<String> stringUnaryOperator = String::toUpperCase;
        names.replaceAll(stringUnaryOperator);
        System.out.println(names);

        Collections.sort(names);
        System.out.println(names);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(12);
        numbers.add(13);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        //removeIf takes a predicate
        Predicate<Integer> p = n -> n > 6;
        numbers.removeIf(p);
        System.out.println(numbers);


    }
}
