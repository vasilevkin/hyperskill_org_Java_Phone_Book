import java.util.Scanner;

class ConcatenateStringsProblem {

    public static String concatenateStringsWithoutDigits(String[] strings) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String string : strings) {
            StringBuilder newString = new StringBuilder();
            for (Character character : string.toCharArray()) {
                if (Character.isDigit(character)) {
                    continue;
                }
                newString.append(character);
            }
            stringBuilder.append(newString);
        }
        return stringBuilder.toString();
        // write your code with StringBuilder here
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split("\\s+");
        String result = concatenateStringsWithoutDigits(strings);
        System.out.println(result);
    }
}
