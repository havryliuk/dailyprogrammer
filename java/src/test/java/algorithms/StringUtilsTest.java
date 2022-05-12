package algorithms;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    @Disabled("Gets out of memory with github actions")
    void testPerformanceOfLoopAndStreamMethods() {
        String s = RandomStringUtils.random(1_000_000_000, true, false).toUpperCase();
        long startLoop = System.currentTimeMillis();
        StringUtils.isUppercaseLoop(s);
        long endLoop = System.currentTimeMillis();

        String s2 = RandomStringUtils.random(1_000_000_000, true, false).toUpperCase();
        long startStream = System.currentTimeMillis();
        StringUtils.isUppercaseStream(s2);
        long endStream = System.currentTimeMillis();

        System.out.printf("Loop: %d\nStream: %d\n", endLoop - startLoop, endStream - startStream);
        // Result: stream is faster
        // Loop: 1728
        // Stream: 1043
    }

    @Test
    void testGoodPassword() {
        String s = "Aa1";
        assertTrue(StringUtils.isGoodPassword(s));
    }

    @Test
    void testBadPassword() {
        String s = "AaaaaaBbbbbb";
        assertFalse(StringUtils.isGoodPassword(s));
    }

    @Test
    void testNormalizeString() {
        String s = "    ,Aaaaa,aBbbbbb ";
        assertEquals("aaaaaabbbbbb", StringUtils.normalize(s));
    }

    @Test
    void testCharacterHasEvenIndex() {
        String s = "pasha";
        assertTrue(StringUtils.hasEvenIndex(s, 's'));
    }
}