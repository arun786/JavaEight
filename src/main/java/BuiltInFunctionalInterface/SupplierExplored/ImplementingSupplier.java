package BuiltInFunctionalInterface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ImplementingSupplier {

    public static void main(String[] args) {

        /**
         * Supplier is used to generate inputs without supplying any parameter
         */
        Supplier<LocalDate> s1 = () -> LocalDate.now();
        Supplier<LocalDate> s2 = LocalDate::now; //Method References
        System.out.println(s1.get());
        System.out.println(s2.get());

        Supplier<List<String>> s3 = ArrayList::new;
        System.out.println(s3.get());

        Supplier<String> s4 = () -> "Sachin Tendulkar";
        System.out.println(s4.get());
    }
}
