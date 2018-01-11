package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateJoining {

    public static void main(String[] args) {
        int[] number = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45};

        /**
         * we define 2 predicates ,
         * 1. number greater than 10
         * 2. number even
         */


        Predicate<Integer> p1 = n -> n > 10;
        Predicate<Integer> p2 = n -> n % 2 == 0;

        /**
         * Number greater than 10
         */
        m1(p1, number); //o/p will be 15 20 25 30 35 40 45

        /**
         * Number divisible by 2
         */
        m1(p2, number); //o/p will be 0 10 20 30 40

        /**
         * Number less than 10
         */
        m1(p1.negate(), number); //o/p will be 0 5 10

        /**
         * Odd number
         */
        m1(p2.negate(), number); //o/p will be 5 15 25 35 45

        /**
         * Number divisible by 2 and is greater than 10
         */
        m1(p1.and(p2), number); //o/p will be 20 30 40

        /**
         * Number divisible by 2 Or greater than 10
         */
        m1(p1.or(p2), number); //o/p will be 0 10 15 20 25 30 35 40 45


    }

    public static void m1(Predicate<Integer> p, int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (p.test(numbers[i])) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();
    }
}
