package JavaInAction.Streams;

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
    }
}

/*output will be
3
3
5
4
{four=4, one=3, three=5, two=3}
*/
