package java11;


import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringTest {

    @Test
    void testRepeat() {
        String test = "havryliuk";
        String repeated = test.repeat(5);
        assertEquals("havryliukhavryliukhavryliukhavryliukhavryliuk", repeated);
    }

    @Test
    void testLines() {
        String multipleLinesString = "First line.\nSecond line.\nThird line.\n";
        List<String> lines = multipleLinesString.lines().collect(Collectors.toList());
        assertEquals(3, lines.size());
    }

    @Test
    void testStripLeading() {
        String hasLeadingWhiteSpace = " Test  ";
        String strippedTest = hasLeadingWhiteSpace.stripLeading();
        assertEquals("Test  ", strippedTest);
    }

    @Test
    void testStripTrailing() {
        String hasTrailingWhiteSpace = " Test  ";
        String strippedTest = hasTrailingWhiteSpace.stripTrailing();
        assertEquals(" Test", strippedTest);
    }

    @Test
    void testStrip() {
        String hasLeadingAndTrailingWhiteSpace = " Test\t\n  ";
        String stripped = hasLeadingAndTrailingWhiteSpace.strip();
        assertEquals("Test", stripped);
    }

    @Test
    void testStrip2() {
        String test = " te st  ";
        String actual = test.strip();
        assertEquals("te st", actual);
    }

    @Test
    void test_isBlank() {
        assertTrue("".isBlank());
        assertTrue(System.getProperty("line.separator").isBlank());
        assertTrue("\t".isBlank());
        assertTrue("    ".isBlank());
        assertTrue("\t\n    ".isBlank());
    }
}
