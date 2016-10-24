package Module7;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Assignment5 {

    public static void main(String[] args) {

        int number = 1000;
        int number2 = 10000;

        List<Integer> integers = new ArrayList<>();
        List<String> strings = new ArrayList<>();

        List<Integer> integers1 = new LinkedList<>();
        List<String> strings1 = new LinkedList<>();

        System.out.println("Add integers to ArrayList: " );
        System.out.println(timeAddInt(integers, number));
        System.out.println(timeAddString(strings, number));
        System.out.println(timeAddInt(integers, number2));
        System.out.println(timeAddString(strings, number2));
        System.out.println("Add integers to LinkedList: ");
        System.out.println(timeAddInt(integers1, number));
        System.out.println(timeAddString(strings1, number));
        System.out.println(timeAddInt(integers1, number2));
        System.out.println(timeAddString(strings1, number2));
        System.out.println("Set integers to ArrayList: " );
        System.out.println(timeSetIntegers(integers, number));
        System.out.println(timeSetStrings(strings,number));
        System.out.println(timeSetIntegers(integers, number2));
        System.out.println(timeSetStrings(strings, number2));
        System.out.println("Set integers to LinkedList: ");
        System.out.println(timeSetIntegers(integers1, number));
        System.out.println(timeSetStrings(strings1, number));
        System.out.println(timeSetIntegers(integers1, number2));
        System.out.println(timeSetStrings(strings1, number2));
        System.out.println("Get integers to ArrayList: " );
        System.out.println(timeGetIntegers(integers, number));
        System.out.println(timeGetStrings(strings, number));
        System.out.println(timeGetIntegers(integers, number2));
        System.out.println(timeGetStrings(strings, number2));
        System.out.println("Get integers to LinkedList: ");
        System.out.println(timeGetIntegers(integers1, number));
        System.out.println(timeGetStrings(strings1, number));
        System.out.println(timeGetIntegers(integers1, number2));
        System.out.println(timeGetStrings(strings1, number2));
        System.out.println("Remove integers from ArrayList: ");
        System.out.println(timeRemoveIntegers(integers, number));
        System.out.println(timeRemoveStrings(strings,number));
        System.out.println(timeSetIntegers(integers, number2));
        System.out.println(timeRemoveStrings(strings, number2));
        System.out.println("Remove integers from LinkedList: ");
        System.out.println(timeRemoveIntegers(integers1, number));
        System.out.println(timeRemoveIntegers(integers1, number2));
        System.out.println(timeRemoveStrings(strings1, number));
        System.out.println(timeGetStrings(strings1, number2));
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
        long start = System.currentTimeMillis();
        addIntegers(integers, integer);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    static long timeAddString(List<String> strings, int integer) {
        long start = System.currentTimeMillis();
        addStrings(strings, integer);
        long finish = System.currentTimeMillis();
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
        long start = System.currentTimeMillis();
        setIntegers(integers, integer);
        long finish = System.currentTimeMillis();
        return finish - start;
    }
    static long timeSetStrings (List<String> strings, int integer){
        long start = System.currentTimeMillis();
        setStrings(strings, integer);
        long finish = System.currentTimeMillis();
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
        long start = System.currentTimeMillis();
        getIntegers(integers, integer);
        long finish = System.currentTimeMillis();
        return finish - start;
    }
    static long timeGetStrings (List<String> strings, int integer){
        long start = System.currentTimeMillis();
        getStrings(strings, integer);
        long finish = System.currentTimeMillis();
        return finish - start;
    }

    static void removeIntegers(List<Integer> integers, int integer) {
        for (int i = 0; i > integer; i--) {
            integers.remove(i);
        }
    }

    static void removeStrings (List<String> strings, int integer) {
        for (int i = 0; i > integer; i--) {
            strings.remove(i);
        }
    }
    static long timeRemoveIntegers(List<Integer> integers, int integer) {
        long start = System.currentTimeMillis();
        removeIntegers(integers, integer);
        long finish = System.currentTimeMillis();
        return finish - start;
    }
    static long timeRemoveStrings (List<String> strings, int integer){
        long start = System.currentTimeMillis();
        removeStrings(strings, integer);
        long finish = System.currentTimeMillis();
        return finish - start;
    }
}
