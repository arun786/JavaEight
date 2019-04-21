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


Deep Clone and Shallow Clone

    package Interview;
    
    import com.google.gson.Gson;
    import com.google.gson.reflect.TypeToken;
    import org.apache.commons.lang.SerializationUtils;
    
    import java.lang.reflect.Type;
    import java.util.HashMap;
    
    public class CloningAHashMap {
    
        public static void main(String[] args) {
            //Shallow Copy
    
            HashMap<String, Employee> employeeMap = new HashMap<>();
            employeeMap.put("1", new Employee("1", "Arun"));
            employeeMap.put("2", new Employee("2", "Pushpa"));
            employeeMap.put("3", new Employee("3", "Adwiti"));
            employeeMap.put("4", new Employee("4", "Arav"));
    
            System.out.println(employeeMap);
    
            HashMap<String, Employee> clone = (HashMap<String, Employee>) employeeMap.clone();
            System.out.println(clone);
    
            clone.get("1").setName("Aruns");
    
            System.out.println("Shallow clone");
    
            /**
             * Both will see the changes
             */
            System.out.println(employeeMap);
            System.out.println(clone);
    
            /**
             * When we do SerializationUtils.clone from Apache common, then
             */
            HashMap<String, Employee> deepCopy = (HashMap<String, Employee>) SerializationUtils.clone(employeeMap);
            deepCopy.get("2").setName("Pushpas");
    
            System.out.println("Deep clone using SerializationUtils of apache common");
            System.out.println(employeeMap);
            System.out.println(deepCopy);
    
            System.out.println("Deep clone using Gson of Google");
            /**
             * Deep clone using gson
             */
    
            Gson gson = new Gson();
            String employeeString = gson.toJson(employeeMap);
            Type type = new TypeToken<HashMap<String, Employee>>() {
            }.getType();
    
            HashMap<String, Employee> deepClonedMap = gson.fromJson(employeeString, type);
            employeeMap.get("1").setName("Arun");
    
            /**
             * deep clone will not get affected
             */
            System.out.println(deepClonedMap);
    
        }
    }
