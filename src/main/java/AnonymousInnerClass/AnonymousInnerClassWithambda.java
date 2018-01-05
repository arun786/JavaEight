package AnonymousInnerClass;

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
