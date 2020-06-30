import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        List<List<Integer>> list = new ArrayList<>(rows);

        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>(columns);

            for (int k = 0; k < columns; k++) {
                row.add(scanner.nextInt());
            }

            list.add(row);
        }

        int distance = scanner.nextInt();

        Collections.rotate(list, distance);

        for (int i = 0; i < rows; i++) {
            for (int k = 0; k < columns; k++) {
                System.out.print(list.get(i).get(k) + " ");
            }
            System.out.println();
        }
        // put your code here
    }
}
