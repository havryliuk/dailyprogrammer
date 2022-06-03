package codewars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareSumTest {

    @Test
    void squareSum() {
        int[] array = new int[]{1, 2, 2};
        assertEquals(9, SquareSum.squareSum(array));
    }
}