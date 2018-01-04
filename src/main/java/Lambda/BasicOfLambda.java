package Lambda;

public class BasicOfLambda {
    public static void main(String[] args) {
        inter1 i = () -> System.out.println("Hello World");
        i.m1();

        inter2 i1 = (a, b) -> a + b;
        int c = i1.add(10, 20);
        System.out.println(c);

        inter3 i2 = s -> s.length();
        int length = i2.getLength("arun");
        System.out.println(length);

        inter4 i3 = x -> x*x;
        int square = i3.squareIt(10);
        System.out.println(square);
    }
}

@FunctionalInterface
interface inter1 {
    void m1();
}

@FunctionalInterface
interface inter2 {
    int add(int a, int b);
}

@FunctionalInterface
interface inter3 {
    int getLength(String a);
}

@FunctionalInterface
interface inter4 {
    int squareIt(int x);
}
