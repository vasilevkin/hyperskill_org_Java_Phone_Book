import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double ax = input.nextDouble();
        double ay = input.nextDouble();
        double bx = input.nextDouble();
        double by = input.nextDouble();
        double result = Math.abs(Math.toDegrees(Math.atan2(ay, ax) - Math.atan2(by, bx)));

        System.out.println(result);
        // put your code here
    }
}
