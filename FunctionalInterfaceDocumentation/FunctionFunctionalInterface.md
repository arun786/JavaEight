# Function Interface

Function is a Functional Interface which has one input parameter of any 
type and return type will be of any type.

    import java.util.function.Function;
    
    /**
     * FunctionInterface is a functional Interface which takes one parameter as input
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
            System.out.println(square.apply(10));
        }
    
    }
    
    
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


UnaryOperator takes an object of the same type and returns an object of the same type.

    public interface UnaryOperator<T> extends Function<T, T>{
    }
    
    
BiFunction and BinaryOperator

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
