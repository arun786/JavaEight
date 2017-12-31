package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Requirement is to filter out data based on the number of letters
 */
public class ValidLambdaExpression {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Apple", "PineApple", "Lemon", "JackFruit");
        List<String> namesLessThan3 = filter(names, (String s) -> s.length() < 6);
        System.out.println(namesLessThan3);
        System.out.println(filter(names, (String s) -> s.length() > 6));
    }


    public static List<String> filter(List<String> names, predicate p) {
        List<String> filteredName = new ArrayList<>();
        names.forEach(
                name -> {
                    if (p.test(name)) {
                        filteredName.add(name);
                    }
                }
        );
        return filteredName;
    }
}

@FunctionalInterface
interface predicate {
    boolean test(String name);
}