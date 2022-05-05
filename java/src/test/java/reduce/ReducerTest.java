package reduce;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReducerTest {

    @Test
    void testSumInt() {
        int result = Reducer.sumInt(new int[] {1, 2, 3, 4, 5, 6});
        assertEquals(21, result);
    }

    @Test
    void testConcatStrings() {
        String result = Reducer.concatStrings(new String[] {"a", "b", "c"});
        assertEquals("abc", result);
    }

    @Test
    void testSumUserAges() {
        User u1 = new User(4);
        User u2 = new User(5);
        User u3 = new User(22);
        List<User> users = Arrays.asList(u1, u2, u3);
        int result = Reducer.sumUserAges(users);
        assertEquals(31, result);
    }
}
