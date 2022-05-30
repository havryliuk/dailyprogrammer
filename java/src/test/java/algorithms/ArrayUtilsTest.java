package algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    static final int[] ARRAY = {1, 2, 3, 4, 5, 6};
    static final int[] SORTED_ARRAY = {1, 3, 15, 22, 35, 41, 55, 69, 74, 84, 90, 500};

    static final int[] ARRAY_A = {-9, 3, 2, -8, 12, -16};
    static final int[] ARRAY_B = {0, -3, -8, -35, 40, 20, 7};

    @Test
    void findInt() {
        OptionalInt result = ArrayUtils.findInt(ARRAY, 3);
        assertEquals(OptionalInt.of(3), result);
    }

    @Test
    void findMissingInt() {
        OptionalInt result = ArrayUtils.findInt(ARRAY, 333);
        assertEquals(OptionalInt.empty(), result);
    }

    @Test
    void binarySearchInt() {
        boolean result = ArrayUtils.binarySearch(SORTED_ARRAY, 500);
        assertTrue(result);
    }

    @Test
    void binarySearchIntNotFound() {
        boolean result = ArrayUtils.binarySearch(SORTED_ARRAY, 1000);
        assertFalse(result);
    }

    @Test
    void getEvenNumbersTest() {
        int[] result = ArrayUtils.getEvenNumbers(ARRAY_A, ARRAY_B);
        Assertions.assertArrayEquals(new int[]{2, -8, 12, -16, 0, -8, 40, 20}, result);
    }

    @Test
    void reverseArray() {
        final int[] arrayC = Arrays.copyOf(ARRAY_B, ARRAY_B.length);
        ArrayUtils.reverse(arrayC);
        Assertions.assertArrayEquals(new int[] {7, 20, 40, -35, -8, -3, 0}, arrayC);
    }

    @Test
    void rotateArrayTest() {
        final int[] arrayToRotate = Arrays.copyOf(SORTED_ARRAY, SORTED_ARRAY.length);
        ArrayUtils.rotateLeft(arrayToRotate);
        Assertions.assertArrayEquals(new int[] {3, 15, 22, 35, 41, 55, 69, 74, 84, 90, 500, 1}, arrayToRotate);
    }
}