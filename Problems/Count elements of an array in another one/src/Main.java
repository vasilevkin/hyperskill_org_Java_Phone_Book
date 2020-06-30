import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] countOccurrences(int[] first, int[] second) {
        int[] result = new int[first.length];

        for (int i = 0; i < first.length; i++) {
            int count = 0;
            for (int target : second) {
                if (first[i] == target) {
                    count++;
                }
            }
            result[i] = count;
        }

        return result;
        // write your code here
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int[] first = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final int[] second = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        final String result = Arrays.toString(countOccurrences(first, second))
                .replace(", ", " ")
                .replace("[", "")
                .replace("]", "");
        System.out.println(result);
    }
}