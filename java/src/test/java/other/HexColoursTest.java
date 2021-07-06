package other;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HexColoursTest {

    @Test
    void hexColor1() {
        HexColours hexColours = new HexColours();
        String actual = hexColours.hexColor(255, 99, 71);
        String expected = "#FF6347";
        assertEquals(expected, actual);
    }

    @Test
    void hexColor2() {
        HexColours hexColours = new HexColours();
        String actual = hexColours.hexColor(184, 134, 11);
        String expected = "#B8860B";
        assertEquals(expected, actual);
    }

    @Test
    void hexColor3() {
        HexColours hexColours = new HexColours();
        String actual = hexColours.hexColor(189, 183, 107);
        String expected = "#BDB76B";
        assertEquals(expected, actual);
    }

    @Test
    void hexColor4() {
        HexColours hexColours = new HexColours();
        String actual = hexColours.hexColor(0, 0, 205);
        String expected = "#0000CD";
        assertEquals(expected, actual);
    }
}
