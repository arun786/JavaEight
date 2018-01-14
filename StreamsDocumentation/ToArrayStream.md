# ToArray Concept of Stream

    package Streams;
    
    import java.util.Arrays;
    import java.util.List;
    
    public class StreamToArray {
    
        public static void main(String[] args) {
            List<Integer> lst = Arrays.asList(10, 20, 30, 40);
            /**
             * ToArray of Stream
             */
            Integer[] arrays = lst.stream().toArray(Integer[]::new);
            for (Integer array : arrays
                    ) {
                System.out.println(array);
            }
        }
    }
