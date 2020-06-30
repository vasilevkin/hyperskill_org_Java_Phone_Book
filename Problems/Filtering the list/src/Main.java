import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }

        var list3 = IntStream.range(0, list.size())
                .filter(n -> n % 2 != 0)
                .mapToObj(list::get)
                .collect(ArrayList::new,
                        (l, e) -> l.add(0, e),
                        (list1, list2) -> list1.addAll(0, list2));

        list3.forEach(n -> System.out.print(n + " "));
        // put your code here
    }
}
