class Predicate {

    public static final TernaryIntPredicate allValuesAreDifferentPredicate =
            (x, y, z) -> (x != y && x != z && y != z);

    // Write a lambda expression here

    @FunctionalInterface
    public interface TernaryIntPredicate {
        boolean test(int n1, int n2, int n3);
        // Write a method here
    }
}
