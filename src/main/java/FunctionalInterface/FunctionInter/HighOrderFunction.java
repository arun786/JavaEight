package FunctionalInterface.FunctionInter;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class HighOrderFunction {

    public static void main(String[] args) {
        Function<Integer, Function<Integer, Integer>> makeAdder = x -> y -> x + y;
        Function<Integer, Integer> apply = makeAdder.apply(10);
        Integer apply1 = apply.apply(20);
        System.out.println(apply1);

        BiFunction<Integer, Integer, Integer> biFunction = (x, y) -> x + y;
        Integer apply2 = biFunction.apply(10, 20);
        System.out.println(apply2);

        /**
         * Functions that receive Function as an argument
         */

        Function<Integer, Integer> add = x -> x + 1;
        Function<Integer, Integer> mul = x -> x * 3;

        /**
         * requirement is increment the number and multiple by 3
         */

        Integer apply3 = mul.apply(add.apply(10));
        System.out.println(apply3);

        /**
         * When we are returning and passing values of same type, we can use UnaryOperator
         * unary Operator takes an object of same type and returns the same type of object
         */

        UnaryOperator<Integer> unaryOperator = x -> x + 1;
        Integer apply4 = unaryOperator.apply(10);
        System.out.println(apply4);


        Function<Integer, UnaryOperator<Integer>> function = x -> y -> x + y;
        UnaryOperator<Integer> apply5 = function.apply(10);
        Integer apply6 = apply5.apply(12);
        System.out.println(apply6);

    }
}
