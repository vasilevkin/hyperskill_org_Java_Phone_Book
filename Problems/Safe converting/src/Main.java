import java.util.Scanner;

public class Main {

    public static int convert(Long val) {
        int result = 0;

        if (val == null) {
            return 0;
        } else if (val > (long) Integer.MAX_VALUE) {
            result = Integer.MAX_VALUE;
        } else if (val < (long) Integer.MIN_VALUE) {
            result = Integer.MIN_VALUE;
        } else {
            result = Integer.parseInt(val.toString());
        }

        return result;
        // write your code here
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));
    }
}