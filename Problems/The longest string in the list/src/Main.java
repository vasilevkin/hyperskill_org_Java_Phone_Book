import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        String longest = "";

        for (String str : list) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, longest);
        }
        // write your code here
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}
