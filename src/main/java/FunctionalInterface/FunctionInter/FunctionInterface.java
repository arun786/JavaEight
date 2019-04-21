package FunctionalInterface.FunctionInter;

import java.util.function.Function;

/**
 * FunctionInter is a functional Interface which takes one parameter as input
 * of any type and can return any type
 */
public class FunctionInterface {

    public static void main(String[] args) {
        /**
         * Function interface which has got one abstract method apply(T t)
         */
        Function<String, Integer> f1 = s -> s.length();
        Integer length = f1.apply("Arun");
        System.out.println(length);

        /**
         * To return square of a number
         */
        Function<Integer, Integer> square = i -> i * i;
        System.out.println(square.apply(10)); //o/p will be 100

        /**
         * Use Of Function Functional Interface to join more condition
         * Requirement is
         *
         * When : Pass A Number
         * Then : Add 5 to a number
         * andThen : square the number
         */

        Function<Integer, Integer> addANumber = number -> number + 5;
        Function<Integer, Integer> squareANumber = number -> number * number;

        int result = addANumber.andThen(squareANumber).apply(5);
        System.out.println(result); //o/p will be 100

        /**
         * Difference between compose and andThen
         */

        /**
         * First addAnumber will be executed that is 25 +5
         * then it will be squared
         * which means step 1 : 25 +5 = 30 and then 30 will be squared. 900
         */
        int andThenResult = addANumber.andThen(squareANumber).apply(25);
        System.out.println(andThenResult);

        /**
         * first square a number will be executed 25 * 25 = 625
         * and then 5 will be added to the result = 625 + 5 = 630
         */
        int composeResult = addANumber.compose(squareANumber).apply(25);
        System.out.println(composeResult);
    }

}
