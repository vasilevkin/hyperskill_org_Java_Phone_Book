import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int n1 = scanner.nextInt();
            int n2 = scanner.nextInt();

            int temp = list.get(n1);
            list.set(n1, list.get(n2));
            list.set(n2, temp);
        }

        System.out.println(list.toString()
                .replace("[", "")
                .replace("]", "")
                .replace(",", "")
        );
        // put your code here
    }
}
