import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final List<String> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());
        String character = scanner.next();
        int count = 0;

        for (String str : list) {
            if (character.equals(str)) {
                count++;
            }
        }

        System.out.println(count);
        // put your code here


        List<String> anonList = new List<String>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @NotNull
            @Override
            public Iterator<String> iterator() {
                return null;
            }

            @NotNull
            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @NotNull
            @Override
            public <T> T[] toArray(@NotNull T[] ts) {
                return null;
            }

            @Override
            public boolean add(String s) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(@NotNull Collection<?> collection) {
                return false;
            }

            @Override
            public boolean addAll(@NotNull Collection<? extends String> collection) {
                return false;
            }

            @Override
            public boolean addAll(int i, @NotNull Collection<? extends String> collection) {
                return false;
            }

            @Override
            public boolean removeAll(@NotNull Collection<?> collection) {
                return false;
            }

            @Override
            public boolean retainAll(@NotNull Collection<?> collection) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public String get(int i) {
                return null;
            }

            @Override
            public String set(int i, String s) {
                return null;
            }

            @Override
            public void add(int i, String s) {

            }

            @Override
            public String remove(int i) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @NotNull
            @Override
            public ListIterator<String> listIterator() {
                return null;
            }

            @NotNull
            @Override
            public ListIterator<String> listIterator(int i) {
                return null;
            }

            @NotNull
            @Override
            public List<String> subList(int i, int i1) {
                return null;
            }
        };
    }
}
