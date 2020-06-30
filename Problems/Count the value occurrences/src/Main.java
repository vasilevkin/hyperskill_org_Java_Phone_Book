import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        int count1 = 0;
        int count2 = 0;

        for (Integer element : list1) {
            if (element == elem) {
                count1++;
            }
        }

        for (Integer element : list2) {
            if (element == elem) {
                count2++;
            }
        }

        return count1 == count2;
        // implement the method
    }
}
