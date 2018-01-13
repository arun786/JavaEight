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
