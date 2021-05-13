package other;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BalancedTest {

    @ParameterizedTest
    @ValueSource(strings = {
        "xxxyyy",
        "yyyxxx",
        "yyxyxxyxxyyyyxxxyxyx",
        ""
    })
    void testBalanced(String s) {
        Balanced balanced = new Balanced();
        boolean actual = balanced.balanced(s);
        assertTrue(actual);
    }

    @ParameterizedTest
    @ValueSource(strings = {
        "xxxyyyy",
        "xyxxxxyyyxyxxyxxyy",
        "x"
    })
    void testUnbalanced(String s) {
        Balanced balanced = new Balanced();
        boolean actual = balanced.balanced(s);
        assertFalse(actual);
    }
}
