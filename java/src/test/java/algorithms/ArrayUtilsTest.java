package algorithms;

import org.junit.jupiter.api.Test;

import java.util.OptionalInt;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    static final int[] ARRAY = {1, 2, 3, 4, 5, 6};
    static final int[] SORTED_ARRAY = {1, 3, 15, 22, 35, 41, 55, 69, 74, 84, 90, 500};

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
}