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