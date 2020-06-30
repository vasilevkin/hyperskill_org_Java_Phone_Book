import java.math.BigInteger;
import java.util.Scanner;

class Main {

    static BigInteger factorial(BigInteger big) {
        if (big.compareTo(BigInteger.ONE) == -1) {
            return BigInteger.ONE;
        }
        return big.multiply(factorial(big.subtract(BigInteger.ONE)));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger m = scanner.nextBigInteger();
        BigInteger fact;
        BigInteger n = BigInteger.ZERO;

        do {
            n = n.add(BigInteger.ONE);
            fact = factorial(n);
        } while (fact.compareTo(m) == -1);

        System.out.println(n);
        // put your code here
    }
}
