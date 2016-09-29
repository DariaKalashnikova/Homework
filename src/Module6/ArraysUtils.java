package Module6;

public final class ArraysUtils {

    static int[] array = {44, 25, 65, 35, 87, 69, 89, 88, 78};

    static int sum(int array[]) {
        int sum = 0;
        {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        }
    }

    static int min(int array[]) {
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static int max(int array[]) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static int maxPositive(int array[]) {
        int maxPositive = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxPositive) {
                maxPositive = array[i];
            }
        }
        if (maxPositive > 0) {
            System.out.println("Max positive in array is " + maxPositive);
        } else {
            System.out.println("Array doesn't have max positive meaning");
        }
        return maxPositive;
    }

    static int multiplication(int array[]) {
        int mult = 1;
        for (int i = 0; i < array.length; i++) {
            mult = mult * array[i];
        }
        return mult;
    }

    static int modulus(int array[]) {
        return array[0] % array.length - 1;
    }

    static int secondLargest(int array[]) {
        int max = max(array);
        int second = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > second && array[i] < max)
                second = array[i];
        }
        return second;
    }

    static int[] reverse(int array[]) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = array[array.length - i - 1];
        }
        return reversed;
    }

    static int[] findEvenElements(int array[]) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " Even numbers found ");
            }
        }
        return array;
    }
}
