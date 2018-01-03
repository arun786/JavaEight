package Lambda;

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
