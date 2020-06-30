import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = readArrayList(scanner);
        int n = scanner.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        int closestDown = Integer.MIN_VALUE;
        int closestUp = Integer.MAX_VALUE;

        for (Integer number : list) {
            if (number == n) {
                closestDown = n;
                closestUp = n;
            } else if (number <= n && number > closestDown) {
                closestDown = number;
            } else if (number >= n && number < closestUp) {
                closestUp = number;
            }
        }

        int distDown = n - (n - closestDown);
        int distUp = (closestUp - n);


        if (distDown - distUp > 2) {
            closestDown = closestUp;
        } else if (distUp - distDown > 2) {
            closestUp = closestDown;
        }

        for (Integer number : list) {
            if (number == closestDown || number == closestUp) {
                result.add(number);
            }
        }

        Collections.sort(result);
        result.forEach(el -> System.out.print(el + " "));
        // write your code here
    }

    private static ArrayList<Integer> readArrayList(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}


//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        ArrayList<Integer> list1 = readArrayList(scanner);
//        ArrayList<Integer> list2 = readArrayList(scanner);
//
//        ArrayList<Integer> result = concatPositiveNumbers(list1, list2);
//
//        result.forEach(n -> System.out.print(n + " "));
//    }
//
//}
