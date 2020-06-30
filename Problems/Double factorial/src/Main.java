import java.math.BigInteger;

class DoubleFactorial {
    public static BigInteger calcDoubleFactorial(int n) {
        BigInteger result = BigInteger.ONE;

        if (n == 0) {
            return BigInteger.ZERO;
        }

        for (int i = n; i >= 0; i -= 2) {
            result = result.multiply(BigInteger.valueOf((long) n));
        }

        return result;
        // type your java code here
    }
}
