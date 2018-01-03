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