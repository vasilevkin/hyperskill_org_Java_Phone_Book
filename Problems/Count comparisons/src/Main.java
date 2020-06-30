import java.util.*;

public class Main {
    public static int count = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int target = scanner.nextInt();
        int index = jumpSearch(array, target);

        System.out.println(count);
        // write your code here
    }

    public static int jumpSearch(int[] array, int target) {
        int currentRight = 0; // right border of the current block
        int prevRight = 0; // right border of the previous block

        /* If array is empty, the element is not found */
        if (array.length == 0) {
            count++;
            return -1;
        }

        /* Check the first element */
        if (array[currentRight] == target) {
            count++;

            return 0;
        }
//        count++;

        /* Calculating the jump length over array elements */
        int jumpLength = (int) Math.sqrt(array.length);

        /* Finding a block where the element may be present */
        while (currentRight < array.length - 1) {

            count++;

            /* Calculating the right border of the following block */
            currentRight = Math.min(array.length - 1, currentRight + jumpLength);

            if (array[currentRight] >= target) {
                count++;
                break; // Found a block that may contain the target element
            } else {
                count++;
            }

            prevRight = currentRight; // update the previous right block border
//            count++;
        }

        /* If the last block is reached and it cannot contain the target value => not found */
        if ((currentRight == array.length - 1) && target > array[currentRight]) {
            count++;
            return -1;
        }

        /* Doing linear search in the found block */
        count++;
        return backwardSearch(array, target, prevRight, currentRight);
    }

    public static int backwardSearch(int[] array, int target, int leftExcl, int rightIncl) {
        for (int i = rightIncl; i > leftExcl; i--) {
            if (array[i] == target) {
//                count++;
                return i;
            }
//            count++;
        }
//        count++;
        return -1;
    }
}
