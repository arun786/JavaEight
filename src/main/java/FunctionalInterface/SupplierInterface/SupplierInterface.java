package FunctionalInterface.SupplierInterface;

import java.util.function.Supplier;

public class SupplierInterface {

    public static void main(String[] args) {
        Supplier<String> s = () -> {
            String array[] = {"arun", "Adwiti", "pushpa", "sachin"};
            int number = (int) (Math.random() * 3 + 1);
            return array[number];
        };
        System.out.println(s.get());
    }
}
