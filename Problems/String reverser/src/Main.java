import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringReverser reverser =
                new StringReverser() {
                    @java.lang.Override
                    public String reverse(String str) {
                        StringBuilder stringBuilder = new StringBuilder();

                        stringBuilder.append(str);
                        stringBuilder.reverse();

                        return stringBuilder.toString();
                    }
                };
                /* create an instance of an anonymous class here,
                                     do not forget ; on the end */

        System.out.println(reverser.reverse(line));
    }

    interface StringReverser {

        String reverse(String str);
    }

}