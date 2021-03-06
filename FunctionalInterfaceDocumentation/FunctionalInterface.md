# Functional Interface

## Definition 

* An Interface which consists of only one abstract method.
* It can contain n numbers of default and static method.

Annotation used for defining Functional Interface is 
@FunctionalInterface but it is not mandatory.

Example of Functional Interface are

* Runnable interface as it contains only one abstract method, run()
* Callable interface -> call()
* Comparable interface -> compareTo()

Note: Functional Interface is used for calling Lambda expression.

If an interface is declared as FunctionalInterface using @FunctionalInterface and 
no abstract method or more than one is declared, it will give a compiler error

Unexpected @FunctionalInterface annotation, multiple non overiding methods.

Example of Functional Interface

    * Example 1 : Valid Functional Interface

    @FunctionalInterface
    public interface Interface1 {
        void m1();
    }
    
    * Example 2 : Valid Functional Interface
    
    @FunctionalInterface
    public interface Interface1 {
    
        void m1();
        default void m2() {
        }
        static void m3() {
        }
    }
    
    * Example 3 : Invalid functional Interface, no abstract method defined
    
    @FunctionalInterface
    public interface Interface1 {
            default void m2() {
            }
            static void m3() {
            }
        }
        
    * Example 4 : Invalid functional Interface, more than one abstract method defined
        
        @FunctionalInterface
        public interface Interface1 {
                void m1();
                void m4();
                default void m2() {
                }
                static void m3() {
                }
            }
            
With respect to Inheritence

    * Example 1, Valid Functional Interface
    Parent contains 1 abstract method and child none.
    @FunctionalInterface
    public interface Interface1 {
        void m1();
    
        default void m2() {
    
        }
    
        static void m3() {
    
        }
    }
    
    @FunctionalInterface
    interface i1 extends Interface1{
        
    }
    
    
    * Example 2, Valid Functional Interface
     Parent contains 1 abstract method and child the same.
        @FunctionalInterface
        public interface Interface1 {
            void m1();
        
            default void m2() {
        
            }
        
            static void m3() {
        
            }
        }
        
        @FunctionalInterface
        interface i1 extends Interface1{
            void m1();
        }
        
    * Example 3, InValid Functional Interface
     Parent contains 1 abstract method and child a different abstract method.
            @FunctionalInterface
            public interface Interface1 {
                void m1();
            
                default void m2() {
            
                }
            
                static void m3() {
            
                }
            }
            
            @FunctionalInterface
            interface i1 extends Interface1{
                void m2();
            }
            
    * Example 4, Valid Functional Interface
     Parent contains 1 abstract method and child a different abstract method.
            @FunctionalInterface
            public interface Interface1 {
                void m1();
            
                default void m2() {
            
                }
            
                static void m3() {
            
                }
            }
            
            interface i1 extends Interface1{
                void m2();
            }

##  How to call a Lambda Expression using Functional Interface

    public class BasicOfLambda {
        public static void main(String[] args) {
            inter1 i = () -> System.out.println("Hello World");
            i.m1();
        }
    }
    
    @FunctionalInterface
    interface inter1 {
        void m1();
    }
    
    o/p will be "Hello World"
    
    
    @FunctionalInterface
    interface inter2 {
        int add(int a, int b);
    }
    
    We can use the below to call the Functional Interface
    
    inter2 i2 = (a,b) -> a+b;
    int sum = i2.add(10,20);
    
    Value of Sum will be 30

# Types of Functional Interface

1. Predicate
2. Consumer

## Example of Predicate

    public class UseOfPredicate {
    
        public static void main(String[] args) {
            /**
             * Predicate is a functional interface which returns boolean
             */
            Predicate<Integer> p = number -> number > 10;
            System.out.println(p.test(13)); //Returns true
            System.out.println(p.test(8)); //Returns false
        }
    }
    
   
### Example 2

    public class UseOFPredicateToFindLength {
        public static void main(String[] args) {
            Predicate<String> p = name -> name.length() > 8;
            System.out.println(p.test("arun"));
            System.out.println(p.test("California"));
        }
    }
    
### Example 3

    public class ToCheckIFListIsEmpty {
        public static void main(String[] args) {
            Predicate<List<String>> p = names -> names.isEmpty();
    
            List<String> lst = new ArrayList<>();
            System.out.println(p.test(lst)); //true
            lst.add("Arun");
            System.out.println(p.test(lst)); //false
        }
    }
    
## Joining of Predicate

    import java.util.function.Predicate;
    
    public class PredicateJoining {
    
        public static void main(String[] args) {
            int[] number = {0, 5, 10, 15, 20, 25, 30, 35, 40, 45};
    
            /**
             * we define 2 predicates ,
             * 1. number greater than 10
             * 2. number even
             */
    
    
            Predicate<Integer> p1 = n -> n > 10;
            Predicate<Integer> p2 = n -> n % 2 == 0;
    
            /**
             * Number greater than 10
             */
            m1(p1, number); //o/p will be 15 20 25 30 35 40 45
    
            /**
             * Number divisible by 2
             */
            m1(p2, number); //o/p will be 0 10 20 30 40
    
            /**
             * Number less than 10
             */
            m1(p1.negate(), number); //o/p will be 0 5 10
    
            /**
             * Odd number
             */
            m1(p2.negate(), number); //o/p will be 5 15 25 35 45
    
            /**
             * Number divisible by 2 and is greater than 10
             */
            m1(p1.and(p2), number); //o/p will be 20 30 40
    
            /**
             * Number divisible by 2 Or greater than 10
             */
            m1(p1.or(p2), number); //o/p will be 0 10 15 20 25 30 35 40 45
    
    
        }
    
        public static void m1(Predicate<Integer> p, int[] numbers) {
            for (int i = 0; i < numbers.length; i++) {
                if (p.test(numbers[i])) {
                    System.out.print(numbers[i] + " ");
                }
            }
            System.out.println();
        }
    }
