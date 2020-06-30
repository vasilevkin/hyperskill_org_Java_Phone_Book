import java.util.function.UnaryOperator;

class PrefixSuffixOperator {

    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";

    public static UnaryOperator<String> operator =
            (str) -> PREFIX + str.trim() + SUFFIX;
    // write your code here
}
