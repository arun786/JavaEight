package Interview;

import java.util.stream.IntStream;

public class LambdaLocalVariableFinal {

    public static void main(String[] args) throws InterruptedException {

        /**
         * Reason for making local variable effectively final
         */
        int[] holder = new int[]{2};


        Runnable runnable = () -> {
            int sum1 = IntStream.of(1, 2, 3).map(value -> value + holder[0]).sum();
            System.out.println(sum1);
        };


        new Thread(runnable).start();

        Thread.sleep(1000); //when we dont use sleep o/p will be 12 and when we use sleep o/p will be 6

        holder[0] = 0;


    }
}
