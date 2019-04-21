package CustomPredicate;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);

    default Predicate<T> and(Predicate<T> other) {
        return v -> this.test(v) && other.test(v);
    }

    default Predicate<T> or(Predicate<T> other) {
        return v -> this.test(v) || other.test(v);
    }

    static <U> Predicate<U> isEqualsTo(U u) {
        return s -> s.equals(u);
    }
}
