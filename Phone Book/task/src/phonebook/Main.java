package phonebook;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String pathToCatalog = "/Users/svasilev/dev/IdeaProjects/Phone Book/data/directory.txt";
    public static String pathToPeople = "/Users/svasilev/dev/IdeaProjects/Phone Book/data/find.txt";

    public static ArrayList<String> catalog = new ArrayList();
    public static ArrayList<String> people = new ArrayList();

    public static long startTimePoint;
    public static long finishTimePoint;
    public static long measuredTimeInMillis;

    public static void main(String[] args) {
        int count = 0;
        startTimePoint = System.currentTimeMillis();

        loadDataFromDisk();
        System.out.println("Start searching...");

        for (String man : people) {
            for (String element : catalog) {
                if (element.contains(man)) {
                    count++;
                    break;
                }
            }
        }

        finishTimePoint = System.currentTimeMillis();
        measuredTimeInMillis = finishTimePoint - startTimePoint;

        System.out.println("Found " + count + " / "
                + people.size() + " entries. Time taken: " +
                formatTime(measuredTimeInMillis));
    }

    public static String formatTime(long millis) {
        int mins = (int) millis / 1000 / 60 % 60;
        int secs = (int) millis / 1000 % 60;
        int ms = (int) millis % 1000;

        return mins + " min. " + secs + " sec. " + ms + " ms.";
    }

    public static void loadDataFromDisk() {
        File catalogFile = new File(pathToCatalog);
        File peopleFile = new File(pathToPeople);
        Scanner catalogScanner = null;
        Scanner peopleScanner = null;

        try {
            catalogScanner = new Scanner(catalogFile);
            peopleScanner = new Scanner(peopleFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (catalogScanner.hasNext()) {
            catalog.add(catalogScanner.nextLine());
        }

        while (peopleScanner.hasNext()) {
            people.add(peopleScanner.nextLine());
        }

    }
}
