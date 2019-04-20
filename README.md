# Java Eight

## Links to Documentation

1. [Functional Interface](https://github.com/arun786/JavaEight/tree/master/FunctionalInterfaceDocumentation) 
2. [Stream API](https://github.com/arun786/JavaEight/tree/master/StreamsDocumentation)
3. [Lambda Expression](https://github.com/arun786/JavaEight/tree/master/LambdaDocumentation)
4. [Date and Time API](https://github.com/arun786/JavaEight/tree/master/DateAndTimeAPIDocumentation)
5. [Java In Action - Streams](https://github.com/arun786/JavaEight/tree/master/JavaInAction/Streams)



New in String class

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
             

Reason for Local variable in Java to be effectively final

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
