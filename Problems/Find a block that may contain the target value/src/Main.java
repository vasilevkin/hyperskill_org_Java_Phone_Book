import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();


        int prevRight = 0;
        int curRight = 0;

        if (n == 0) System.out.println("-1");
        if (numbers[curRight] == target) System.out.println("0 0");

        int blockSize = (int) Math.sqrt(n);

        while (curRight < n - 1) {
            curRight = Math.min(n - 1, curRight + blockSize);

            if (numbers[curRight] >= target) break;

            prevRight = curRight;
        }

        if ((curRight == n - 1) && target > numbers[curRight]) System.out.println("-1");

        System.out.println(prevRight + " " + (curRight - 1));
        // put your code here
    }
}
