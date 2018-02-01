package Lambda;

public class UseOfLambdaInRunnable {

    public static void main(String[] args) {
        /**
         * Runnable interface has run() which is called internally when t1.start is called
         */
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        };
        Thread t1 = new Thread(r);
        t1.start();


    }
}
