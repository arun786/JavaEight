package FunctionalInterface.FunctionInter;

import java.util.function.Function;

public class ExampleOfFunction {

    public static void main(String[] args) {

        /**
         * Function interface takes in a parameter and has a return type
         */

        Function<String, String> function = x -> x + 1;
        String apply = function.apply("1");
        System.out.println(apply);

        Function<Integer, Integer> function1 = x -> x + 1;
        Integer apply1 = function1.apply(1);
        System.out.println(apply1);

        Function<Integer, Integer> function2 = Utils::add;
        Integer apply2 = function2.apply(10);
        System.out.println(apply2);

        Function<String, String> function3 = Utils::concat;
        String apply3 = function3.apply("10");
        System.out.println(apply3);

    }

}

class Utils {
    public static int add(int x) {
        return x + 1;
    }


    public static String concat(String a) {
        return a + 1;
    }
}
