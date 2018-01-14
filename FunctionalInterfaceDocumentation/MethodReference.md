# Method Reference

    /**
     * :: is used for Method reference, the argument type should be same and
     * number of arguments should be same
     */
    public class MethodReference {
    
        public static void main(String[] args) {
    
            interf i = MethodReference::m2; //Method Reference
            i.m1();
    
            interf3 i3 = new MethodReference()::m3;
            String str = i3.m2();
            System.out.println(str);
        }
    
        public static void m2() {
            System.out.println("Method Reference of m2...");
        }
    
        public String m3() {
            System.out.println("Instance Method m3...");
            return "Method Reference returning String";
        }
    }
    
    interface interf {
        void m1();
    }
    
    interface interf3 {
        String m2();
    }

## Method Reference for Runnable 

    package MethodReference;
    
    public class MethodReferenceWithThread {
    
        /**
         * 1. With Lambda Expression, we call threads
         * Here we cannot have code reusability
         */
        public void ThreadUsingLambdaExpression() {
            Runnable r = () -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread with Lambda Expression..." + i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
    
            Thread t1 = new Thread(r);
            t1.start();
        }
    
        /**
         * For Method Reference we create a method which can be reused
         */
        public void ThreadUsingMethodReference() {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread with Method Reference... " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    
        public static void main(String[] args) {
    
            MethodReferenceWithThread ob = new MethodReferenceWithThread();
            ob.ThreadUsingLambdaExpression();
    
            /**
             * We can call the Method reference using the below syntax
             */
    
            Runnable r = ob::ThreadUsingMethodReference;
            Thread t = new Thread(r);
            t.start();
        }
    }
