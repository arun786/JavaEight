package CustomPredicate;

public class App {
    public static void main(String[] args) {

        Predicate<String> p1 = s -> s.length() < 20;
        boolean hello = p1.test("Hello");
        System.out.println("Hello is shorter than 20 : " + hello);

        Predicate<String> p2 = s -> s.length() > 5;
        boolean hello1 = p2.test("Hello");
        System.out.println("Hello is greater than 5 characters : " + hello1);

        Predicate<String> p3 = p1.and(p2);
        boolean yes = p3.test("yes");
        System.out.println(yes);

        boolean this_is_india = p3.test("This is India");
        System.out.println(this_is_india);

        Predicate<String> p4 = p1.or(p2);
        boolean rest = p4.test("Rest");
        System.out.println("Rest is less than 20 which is true and greater than 5 which is false, so or condition  " + rest);

        Predicate<String> p5 = Predicate.isEqualsTo("Yes");
        boolean yes1 = p5.test("Yes");
        System.out.println("p5 value is Yes " + yes1);
        Predicate<Integer> p6 = Predicate.isEqualsTo(10);
        boolean test = p6.test(10);
        System.out.println("P6 value is 10 " + test);
    }
}
