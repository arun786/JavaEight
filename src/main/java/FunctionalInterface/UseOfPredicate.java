package FunctionalInterface;

import java.util.function.Predicate;

public class UseOfPredicate {

    public static void main(String[] args) {
        /**
         * Predicate is a functional interface which returns boolean
         */
        Predicate<Integer> p = number -> number > 10;
        System.out.println(p.test(13)); //Returns true
        System.out.println(p.test(8)); //Returns false
    }
}
