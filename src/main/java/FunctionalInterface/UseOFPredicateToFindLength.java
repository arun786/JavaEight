package FunctionalInterface;

import java.util.function.Predicate;

public class UseOFPredicateToFindLength {
    public static void main(String[] args) {
        Predicate<String> p = name -> name.length() > 8;
        System.out.println(p.test("arun"));
        System.out.println(p.test("California"));
    }
}
