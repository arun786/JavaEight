package FunctionalInterface.FunctionInter;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BiFunctionAndBiNaryOperator {

    public static void main(String[] args) {

        /**
         * It takes two parameters of same or different type and returns an object of the same or different type
         */
        BiFunction<Integer, Integer, Integer> sum = (x, y) -> x + y;
        Integer apply = sum.apply(10, 20);
        System.out.println(apply);

        /**
         * Binary Operator takes two objects of the same type and returns an object of the same type
         */
        BinaryOperator<Integer> sumOf = (x, y) -> x + y;
        Integer apply1 = sumOf.apply(10, 20);
        System.out.println(apply1);
    }
}
