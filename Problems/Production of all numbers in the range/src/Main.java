import java.util.function.*;


class Operator {

    public static LongBinaryOperator binaryOperator =
            (x, y) -> {
                if (x == y) {
                    return x;
                }
                long result = x;
                for (long i = x + 1; i <= y; i++) {
                    result *= i;
                }
                return result;
            };

    // Write your code here
}
