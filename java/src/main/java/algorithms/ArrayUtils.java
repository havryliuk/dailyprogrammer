package algorithms;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class ArrayUtils {

    static OptionalInt findInt(int[] array, int value) {
        return Arrays.stream(array).filter(x -> x == value).findFirst();
    }

    static boolean binarySearch(int[] array, final int value) {
        int min = 0;
        int max = array.length - 1;

        while (min <= max) {
            int mid = (min + max) / 2;
            if (array[mid] == value) {
                return true;
            } else if (value < array[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }

        return false;
    }

    static int[] getEvenNumbers(int[] arrayA, int[] arrayB) {
        IntPredicate isEven = value -> value % 2 == 0;
        return Stream.of(arrayA, arrayB).flatMapToInt(Arrays::stream).filter(isEven).toArray();
    }

    static void reverse(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            int secondIndex = array.length - 1 - i;
            array[i] = array[secondIndex];
            array[secondIndex] = temp;
        }
    }

    public static void rotateLeft(int[] array) {
        int firstItem = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        // or System.arraycopy(array, 1, array, 0, array.length - 1);
        array[array.length - 1] = firstItem;
    }
}
