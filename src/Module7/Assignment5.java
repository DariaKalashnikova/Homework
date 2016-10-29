package Module7;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Assignment5 {
    private static final int NUMBER = 10_000;

    public static void main(String[] args) {

        List<Integer> integerArrayList = new ArrayList<>();
        List<String> stringArrayList = new ArrayList<>();

        List<Integer> integerLinkedList = new LinkedList<>();
        List<String> stringLinkedList = new LinkedList<>();

        System.out.println("Add integerArrayList to ArrayList: ");
        System.out.println(timeAddInt(integerArrayList, NUMBER));
        System.out.println(timeAddString(stringArrayList, NUMBER));
        System.out.println("Add integerArrayList to LinkedList: ");
        System.out.println(timeAddInt(integerLinkedList, NUMBER));
        System.out.println(timeAddString(stringLinkedList, NUMBER));
        System.out.println("Set integerArrayList to ArrayList: ");
        System.out.println(timeSetIntegers(integerArrayList, NUMBER));
        System.out.println(timeSetStrings(stringArrayList, NUMBER));
        System.out.println("Set integerArrayList to LinkedList: ");
        System.out.println(timeSetIntegers(integerLinkedList, NUMBER));
        System.out.println(timeSetStrings(stringLinkedList, NUMBER));
        System.out.println("Get integerArrayList to ArrayList: ");
        System.out.println(timeGetIntegers(integerArrayList, NUMBER));
        System.out.println(timeGetStrings(stringArrayList, NUMBER));
        System.out.println("Get integerArrayList to LinkedList: ");
        System.out.println(timeGetIntegers(integerLinkedList, NUMBER));
        System.out.println(timeGetStrings(stringLinkedList, NUMBER));
        System.out.println("Remove integerArrayList from ArrayList: ");
        System.out.println(timeRemoveIntegers(integerArrayList));
        System.out.println(timeRemoveStrings(stringArrayList));
        System.out.println("Remove integerArrayList from LinkedList: ");
        System.out.println(timeRemoveIntegers(integerLinkedList));
        System.out.println(timeRemoveStrings(stringLinkedList));
    }


    static void addIntegers(List<Integer> integers, int integer) {
        for (int i = 0; i < integer; i++) {
            integers.add(i);
        }
    }

    static void addStrings(List<String> strings, int integer) {
        for (int i = 0; i < integer; i++) {
            strings.add("el");
        }
    }

    static long timeAddInt(List<Integer> integers, int integer) {
        long start = System.nanoTime();
        addIntegers(integers, integer);
        long finish = System.nanoTime();
        return finish - start;
    }

    static long timeAddString(List<String> strings, int integer) {
        long start = System.nanoTime();
        addStrings(strings, integer);
        long finish = System.nanoTime();
        return finish - start;
    }

    static void setIntegers(List<Integer> integers, int integer) {
        for (int i = 0; i < integer; i++) {
            integers.set(i, i++);
        }
    }

    static void setStrings(List<String> strings, int integer) {
        for (int i = 0; i < integer; i++) {
            strings.set(i, "set");
        }
    }

    static long timeSetIntegers(List<Integer> integers, int integer) {
        long start = System.nanoTime();
        setIntegers(integers, integer);
        long finish = System.nanoTime();
        return finish - start;
    }

    static long timeSetStrings(List<String> strings, int integer) {
        long start = System.nanoTime();
        setStrings(strings, integer);
        long finish = System.nanoTime();
        return finish - start;
    }

    static void getIntegers(List<Integer> integers, int integer) {
        for (int i = 0; i < integer; i++) {
            integers.get(i);
        }
    }

    static void getStrings(List<String> strings, int integer) {
        for (int i = 0; i < integer; i++) {
            strings.get(i);
        }
    }

    static long timeGetIntegers(List<Integer> integers, int integer) {
        long start = System.nanoTime();
        getIntegers(integers, integer);
        long finish = System.nanoTime();
        return finish - start;
    }

    static long timeGetStrings(List<String> strings, int integer) {
        long start = System.nanoTime();
        getStrings(strings, integer);
        long finish = System.nanoTime();
        return finish - start;
    }

    static void removeIntegers(List<Integer> integers) {
        int size = integers.size();
        for (int i = 0; i < size; i++) {
            integers.remove(i);
            size--;
        }
        //integers.removeAll(integers);

/*        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
        }*/
    }

    static void removeStrings(List<String> strings) {
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
        }
    }

    static long timeRemoveIntegers(List<Integer> integers) {
        long start = System.nanoTime();
        removeIntegers(integers);
        long finish = System.nanoTime();
        return finish - start;
    }

    static long timeRemoveStrings(List<String> strings) {
        long start = System.nanoTime();
        removeStrings(strings);
        long finish = System.nanoTime();
        return finish - start;
    }
}
