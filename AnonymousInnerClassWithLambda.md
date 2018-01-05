# Anonymous Inner Class


## Anonymous Inner Class without Lambda

    public class AnonymousInnerClass {

        public static void main(String[] args) {
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Child Thread");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            };

            Thread t = new Thread(r);
            t.start();

            for (int i = 0; i < 10; i++) {
                System.out.println("Main Thread");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

## Anonymous Inner class replaced with Lambda Expression

    public class AnonymousInnerClassWithambda {
        public static void main(String[] args) {
            Runnable r = () -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child Thread");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };

            Thread t = new Thread(r);
            t.start();

            for (int i = 0; i < 10; i++) {
                System.out.println("Main Thread");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }


## Shorter form than above example

    public class AnonymousInnerClassWithLambdaIn {
        public static void main(String[] args) {
            Thread t = new Thread(() -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Child thread");
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

            t.start();

            for (int i = 0; i < 10; i++) {
                System.out.println("Main thread");
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
