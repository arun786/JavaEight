package JavaInAction.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsCanBeIeratedOnlyOnce {

    public static void main(String[] args) {
        List<String> crickters = Arrays.asList("Sachin", "Rahul", "Ganguly");
        Stream<String> c = crickters.stream();
        c.forEach(a -> System.out.println(a));
        c.forEach(b -> System.out.println(b)); //This will give illegal state exception
    }
}
