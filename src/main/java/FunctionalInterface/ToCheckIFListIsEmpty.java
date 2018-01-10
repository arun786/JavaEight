package FunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ToCheckIFListIsEmpty {
    public static void main(String[] args) {
        Predicate<List<String>> p = names -> names.isEmpty();

        List<String> lst = new ArrayList<>();
        System.out.println(p.test(lst)); //true
        lst.add("Arun");
        System.out.println(p.test(lst)); //false
    }
}
