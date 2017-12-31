package Lambda;

public class UseOfRunMethod {

    public static void main(String[] args) {

        process(() -> System.out.println("This is great"));
    }

    public static void process(Runnable r) {
        r.run();
    }
}
