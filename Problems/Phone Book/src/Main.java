import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static class TableEntry<T> {
        private final int key;
        private final T value;
        private boolean removed;

        public TableEntry(int key, T value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public T getValue() {
            return value;
        }

        public void remove() {
            removed = true;
        }

        public boolean isRemoved() {
            return removed;
        }
    }

    private static class HashTable<T> {
        private int size;
        private TableEntry[] table;

        public HashTable(int size) {
            this.size = size;
            table = new TableEntry[size];
        }

        public boolean put(int key, T value) {
            int idx = findKey(key);

            if (idx == -1) {
                return false;
            }

            table[idx] = new TableEntry(key, value);
            return true;
            // put your code here
        }

        public T get(int key) {
            int idx = findKey(key);

            if (idx == -1 || table[idx] == null) {
                return null;
            }

            return (T) table[idx].getValue();
            // put your code here
        }

        public void remove(int key) {
            int idx = findKey(key);

            if (idx == -1 || table[idx] == null) {
                return;
            }

            table[idx] = null;
            // put your code here
        }

        private int findKey(int key) {
            int hash = key % size;

            while (!(table[hash] == null || table[hash].getKey() == key)) {
                hash = (hash + 1) % size;

                if (hash == key % size) {
                    return -1;
                }
            }

            return hash;
            // put your code here
        }
    }

    public static void main(String[] args) {
        HashTable<String> hashTable = new HashTable<>(100);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int id;
        String number;
        String result;

        while (scanner.hasNext()) {
            String command = scanner.next();

            switch (command) {
                case "put":
                    id = scanner.nextInt();
                    number = scanner.next();
                    hashTable.put(id, number);
                    break;
                case "get":
                    id = scanner.nextInt();
                    result = hashTable.get(id);
                    System.out.println(Objects.requireNonNullElse(result, "-1"));
                    break;
                case "remove":
                    id = scanner.nextInt();
                    hashTable.remove(id);
            }
        }
        // put your code here
    }
}
