package FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args) {
        /**
         * Consumer function will have one input type and no return type
         */
        Consumer<String> c = s -> System.out.println(s);
        c.accept("arun");
    }
}
