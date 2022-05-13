package algorithms;

import java.util.Arrays;
import java.util.OptionalInt;

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
}
