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
 