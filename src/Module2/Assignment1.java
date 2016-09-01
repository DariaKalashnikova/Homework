package Module2;


public class Assignment1 {

    static int[] array = {3208, 2098, 3547, 4453, 8798, 9922, 1211, 9657, 4456, 3214};
    static double[] array1 = {23.5, -5.06, 56.5, 329.2, 7.89, -6.28, 45.8, 55.3, 99.3, 125.3};

    //calculate sum of int and double

    static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    static double sum(double[] array1) {
        double sum = 0;
        for (double arrayItem : array1) {
            sum += arrayItem;
        }
        return sum;
    }

    //calculate min of int and double

    static int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    static double min(double[] array1) {
        double min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
        }
        return min;
    }

    // calculate max of int and double

    static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    static double max(double[] array1) {
        double max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        return max;
    }
    //max positive of int and double

    static public void maxPositive(int[] array) {
        int maxPositive = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxPositive) {
                maxPositive = array[i];
            }
        }
        if (maxPositive > 0) {
            System.out.println("Int max positive is " + maxPositive);
        } else System.out.println("no positive elements in the array");

    }

    static public void maxPositive(double[] array1) {
        double maxPositive1 = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] > maxPositive1) {
                maxPositive1 = array1[i];
            }
        }
        if (maxPositive1 > 0) {
            System.out.println("Double max positive is " + maxPositive1);
        } else System.out.println("no positive elements in the array");

    }
    //multiplication

    static int multiplication(int[] array) {
        int arrayMult = 1;
        for (int i = 0; i < array.length; i++) {
            arrayMult = arrayMult * array[i];
        }
        return arrayMult;
    }

    static double multiplication(double[] array1) {
        double arrayMult1 = 1;
        for (int i = 0; i < array1.length; i++) {
            arrayMult1 = arrayMult1 * array1[i];
        }
        return arrayMult1;
    }

//modulus of first and last element

    static int modulus(int[] array) {
        return array[0] % array.length - 1;
    }

    static double modulus(double[] array1) {
        return array1[0] % array1.length - 1;
    }

//second largest element

    static int secondLargest(int[] array) {
        int max = max(array);
        int second = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > second && array[i] < max)
                second = array[i];
        }
        return second;
    }

    static double secondLargest1(double[] array1) {
        double max = max(array1);
        double second1 = 0;
        for (double item : array1) {
            if (item > second1 && item < max)
                second1 = item;
        }
        return second1;
    }


    public static void main(String[] args) {
        System.out.println("Int sum is " + sum(array));
        System.out.println("Double sum is  " + sum(array1));
        System.out.println("Int min is " + min(array));
        System.out.println("double min is " + min(array1));
        System.out.println("Int max is " + max(array));
        System.out.println("Double max is " + max(array1));
        maxPositive(array);
        maxPositive(array1);
        System.out.println("Int multiplication is " + multiplication(array));
        System.out.println("Double multiplication is " + multiplication(array1));
        System.out.println("Int modulus is " + modulus(array));
        System.out.println("Double modulus is " + modulus(array1));
        System.out.println("Int second largest element is " + secondLargest(array));
        System.out.println("Double second largest element is " + secondLargest1(array1));
    }
}


