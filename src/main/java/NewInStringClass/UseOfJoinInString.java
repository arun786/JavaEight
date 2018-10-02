package NewInStringClass;

import java.util.Arrays;
import java.util.List;

public class UseOfJoinInString {
    public static void main(String[] args) {

        List<String> listOfNumbers = Arrays.asList("10", "20", "30", "40");
        /**
         * I want to join the numbers in a list using -
         */

        String join = String.join("-", listOfNumbers);
        System.out.println(join);

        /**
         * o/p will be
         * 10-20-30-40
         */

    }
}
